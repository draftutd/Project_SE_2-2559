// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.roo.team01.web;

import com.roo.team01.domain.LogUserRole;
import com.roo.team01.web.LogUserRoleController;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect LogUserRoleController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String LogUserRoleController.create(@Valid LogUserRole logUserRole, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, logUserRole);
            return "loguserroles/create";
        }
        uiModel.asMap().clear();
        logUserRole.persist();
        return "redirect:/loguserroles/" + encodeUrlPathSegment(logUserRole.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String LogUserRoleController.createForm(Model uiModel) {
        populateEditForm(uiModel, new LogUserRole());
        return "loguserroles/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String LogUserRoleController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("loguserrole", LogUserRole.findLogUserRole(id));
        uiModel.addAttribute("itemId", id);
        return "loguserroles/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String LogUserRoleController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("loguserroles", LogUserRole.findLogUserRoleEntries(firstResult, sizeNo, sortFieldName, sortOrder));
            float nrOfPages = (float) LogUserRole.countLogUserRoles() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("loguserroles", LogUserRole.findAllLogUserRoles(sortFieldName, sortOrder));
        }
        return "loguserroles/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String LogUserRoleController.update(@Valid LogUserRole logUserRole, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, logUserRole);
            return "loguserroles/update";
        }
        uiModel.asMap().clear();
        logUserRole.merge();
        return "redirect:/loguserroles/" + encodeUrlPathSegment(logUserRole.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String LogUserRoleController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, LogUserRole.findLogUserRole(id));
        return "loguserroles/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String LogUserRoleController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        LogUserRole logUserRole = LogUserRole.findLogUserRole(id);
        logUserRole.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/loguserroles";
    }
    
    void LogUserRoleController.populateEditForm(Model uiModel, LogUserRole logUserRole) {
        uiModel.addAttribute("logUserRole", logUserRole);
    }
    
    String LogUserRoleController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
