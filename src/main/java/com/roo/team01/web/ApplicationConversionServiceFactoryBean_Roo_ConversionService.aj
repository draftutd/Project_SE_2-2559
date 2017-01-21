// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.roo.team01.web;

import com.roo.team01.domain.Add_Promotion;
import com.roo.team01.domain.Comment;
import com.roo.team01.domain.Customer;
import com.roo.team01.domain.Delivery;
import com.roo.team01.domain.LogUser;
import com.roo.team01.domain.LogUserRole;
import com.roo.team01.domain.Ordered;
import com.roo.team01.domain.Payment;
import com.roo.team01.domain.Post;
import com.roo.team01.domain.PreOrder;
import com.roo.team01.domain.Product;
import com.roo.team01.domain.Product_stock;
import com.roo.team01.domain.Promotion;
import com.roo.team01.domain.PurchaseOrder;
import com.roo.team01.domain.ReserveData;
import com.roo.team01.domain.Stock_bill;
import com.roo.team01.domain.Total_amount;
import com.roo.team01.web.ApplicationConversionServiceFactoryBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    declare @type: ApplicationConversionServiceFactoryBean: @Configurable;
    
    public Converter<Add_Promotion, String> ApplicationConversionServiceFactoryBean.getAdd_PromotionToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.roo.team01.domain.Add_Promotion, java.lang.String>() {
            public String convert(Add_Promotion add_Promotion) {
                return "(no displayable fields)";
            }
        };
    }
    
    public Converter<Long, Add_Promotion> ApplicationConversionServiceFactoryBean.getIdToAdd_PromotionConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.roo.team01.domain.Add_Promotion>() {
            public com.roo.team01.domain.Add_Promotion convert(java.lang.Long id) {
                return Add_Promotion.findAdd_Promotion(id);
            }
        };
    }
    
    public Converter<String, Add_Promotion> ApplicationConversionServiceFactoryBean.getStringToAdd_PromotionConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.roo.team01.domain.Add_Promotion>() {
            public com.roo.team01.domain.Add_Promotion convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Add_Promotion.class);
            }
        };
    }
    
    public Converter<Comment, String> ApplicationConversionServiceFactoryBean.getCommentToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.roo.team01.domain.Comment, java.lang.String>() {
            public String convert(Comment comment) {
                return new StringBuilder().append(comment.getText()).append(' ').append(comment.getUsers()).toString();
            }
        };
    }
    
    public Converter<Long, Comment> ApplicationConversionServiceFactoryBean.getIdToCommentConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.roo.team01.domain.Comment>() {
            public com.roo.team01.domain.Comment convert(java.lang.Long id) {
                return Comment.findComment(id);
            }
        };
    }
    
    public Converter<String, Comment> ApplicationConversionServiceFactoryBean.getStringToCommentConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.roo.team01.domain.Comment>() {
            public com.roo.team01.domain.Comment convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Comment.class);
            }
        };
    }
    
    public Converter<Customer, String> ApplicationConversionServiceFactoryBean.getCustomerToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.roo.team01.domain.Customer, java.lang.String>() {
            public String convert(Customer customer) {
                return new StringBuilder().append(customer.getUserName()).append(' ').append(customer.getPassword()).append(' ').append(customer.getPhone()).append(' ').append(customer.getAddress()).toString();
            }
        };
    }
    
    public Converter<Long, Customer> ApplicationConversionServiceFactoryBean.getIdToCustomerConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.roo.team01.domain.Customer>() {
            public com.roo.team01.domain.Customer convert(java.lang.Long id) {
                return Customer.findCustomer(id);
            }
        };
    }
    
    public Converter<String, Customer> ApplicationConversionServiceFactoryBean.getStringToCustomerConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.roo.team01.domain.Customer>() {
            public com.roo.team01.domain.Customer convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Customer.class);
            }
        };
    }
    
    public Converter<Delivery, String> ApplicationConversionServiceFactoryBean.getDeliveryToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.roo.team01.domain.Delivery, java.lang.String>() {
            public String convert(Delivery delivery) {
                return new StringBuilder().append(delivery.getNote()).toString();
            }
        };
    }
    
    public Converter<Long, Delivery> ApplicationConversionServiceFactoryBean.getIdToDeliveryConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.roo.team01.domain.Delivery>() {
            public com.roo.team01.domain.Delivery convert(java.lang.Long id) {
                return Delivery.findDelivery(id);
            }
        };
    }
    
    public Converter<String, Delivery> ApplicationConversionServiceFactoryBean.getStringToDeliveryConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.roo.team01.domain.Delivery>() {
            public com.roo.team01.domain.Delivery convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Delivery.class);
            }
        };
    }
    
    public Converter<LogUser, String> ApplicationConversionServiceFactoryBean.getLogUserToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.roo.team01.domain.LogUser, java.lang.String>() {
            public String convert(LogUser logUser) {
                return new StringBuilder().append(logUser.getUsername()).append(' ').append(logUser.getPassword()).append(' ').append(logUser.getFirstname()).append(' ').append(logUser.getLastname()).toString();
            }
        };
    }
    
    public Converter<Long, LogUser> ApplicationConversionServiceFactoryBean.getIdToLogUserConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.roo.team01.domain.LogUser>() {
            public com.roo.team01.domain.LogUser convert(java.lang.Long id) {
                return LogUser.findLogUser(id);
            }
        };
    }
    
    public Converter<String, LogUser> ApplicationConversionServiceFactoryBean.getStringToLogUserConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.roo.team01.domain.LogUser>() {
            public com.roo.team01.domain.LogUser convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), LogUser.class);
            }
        };
    }
    
    public Converter<LogUserRole, String> ApplicationConversionServiceFactoryBean.getLogUserRoleToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.roo.team01.domain.LogUserRole, java.lang.String>() {
            public String convert(LogUserRole logUserRole) {
                return new StringBuilder().append(logUserRole.getRoleName()).toString();
            }
        };
    }
    
    public Converter<Long, LogUserRole> ApplicationConversionServiceFactoryBean.getIdToLogUserRoleConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.roo.team01.domain.LogUserRole>() {
            public com.roo.team01.domain.LogUserRole convert(java.lang.Long id) {
                return LogUserRole.findLogUserRole(id);
            }
        };
    }
    
    public Converter<String, LogUserRole> ApplicationConversionServiceFactoryBean.getStringToLogUserRoleConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.roo.team01.domain.LogUserRole>() {
            public com.roo.team01.domain.LogUserRole convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), LogUserRole.class);
            }
        };
    }
    
    public Converter<Ordered, String> ApplicationConversionServiceFactoryBean.getOrderedToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.roo.team01.domain.Ordered, java.lang.String>() {
            public String convert(Ordered ordered) {
                return new StringBuilder().append(ordered.getAmount()).append(' ').append(ordered.getNum()).append(' ').append(ordered.getSendBy()).toString();
            }
        };
    }
    
    public Converter<Long, Ordered> ApplicationConversionServiceFactoryBean.getIdToOrderedConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.roo.team01.domain.Ordered>() {
            public com.roo.team01.domain.Ordered convert(java.lang.Long id) {
                return Ordered.findOrdered(id);
            }
        };
    }
    
    public Converter<String, Ordered> ApplicationConversionServiceFactoryBean.getStringToOrderedConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.roo.team01.domain.Ordered>() {
            public com.roo.team01.domain.Ordered convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Ordered.class);
            }
        };
    }
    
    public Converter<Payment, String> ApplicationConversionServiceFactoryBean.getPaymentToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.roo.team01.domain.Payment, java.lang.String>() {
            public String convert(Payment payment) {
                return new StringBuilder().append(payment.getAccount()).append(' ').append(payment.getDates()).append(' ').append(payment.getTimes()).append(' ').append(payment.getAmount()).toString();
            }
        };
    }
    
    public Converter<Long, Payment> ApplicationConversionServiceFactoryBean.getIdToPaymentConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.roo.team01.domain.Payment>() {
            public com.roo.team01.domain.Payment convert(java.lang.Long id) {
                return Payment.findPayment(id);
            }
        };
    }
    
    public Converter<String, Payment> ApplicationConversionServiceFactoryBean.getStringToPaymentConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.roo.team01.domain.Payment>() {
            public com.roo.team01.domain.Payment convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Payment.class);
            }
        };
    }
    
    public Converter<Post, String> ApplicationConversionServiceFactoryBean.getPostToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.roo.team01.domain.Post, java.lang.String>() {
            public String convert(Post post) {
                return new StringBuilder().append(post.getText()).append(' ').append(post.getUsers()).toString();
            }
        };
    }
    
    public Converter<Long, Post> ApplicationConversionServiceFactoryBean.getIdToPostConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.roo.team01.domain.Post>() {
            public com.roo.team01.domain.Post convert(java.lang.Long id) {
                return Post.findPost(id);
            }
        };
    }
    
    public Converter<String, Post> ApplicationConversionServiceFactoryBean.getStringToPostConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.roo.team01.domain.Post>() {
            public com.roo.team01.domain.Post convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Post.class);
            }
        };
    }
    
    public Converter<PreOrder, String> ApplicationConversionServiceFactoryBean.getPreOrderToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.roo.team01.domain.PreOrder, java.lang.String>() {
            public String convert(PreOrder preOrder) {
                return new StringBuilder().append(preOrder.getName()).append(' ').append(preOrder.getAmount()).append(' ').append(preOrder.getDates()).append(' ').append(preOrder.getUname()).toString();
            }
        };
    }
    
    public Converter<Long, PreOrder> ApplicationConversionServiceFactoryBean.getIdToPreOrderConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.roo.team01.domain.PreOrder>() {
            public com.roo.team01.domain.PreOrder convert(java.lang.Long id) {
                return PreOrder.findPreOrder(id);
            }
        };
    }
    
    public Converter<String, PreOrder> ApplicationConversionServiceFactoryBean.getStringToPreOrderConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.roo.team01.domain.PreOrder>() {
            public com.roo.team01.domain.PreOrder convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), PreOrder.class);
            }
        };
    }
    
    public Converter<Product, String> ApplicationConversionServiceFactoryBean.getProductToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.roo.team01.domain.Product, java.lang.String>() {
            public String convert(Product product) {
                return new StringBuilder().append(product.getName()).append(' ').append(product.getPrice()).append(' ').append(product.getDetail()).append(' ').append(product.getAmount()).toString();
            }
        };
    }
    
    public Converter<Long, Product> ApplicationConversionServiceFactoryBean.getIdToProductConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.roo.team01.domain.Product>() {
            public com.roo.team01.domain.Product convert(java.lang.Long id) {
                return Product.findProduct(id);
            }
        };
    }
    
    public Converter<String, Product> ApplicationConversionServiceFactoryBean.getStringToProductConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.roo.team01.domain.Product>() {
            public com.roo.team01.domain.Product convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Product.class);
            }
        };
    }
    
    public Converter<Product_stock, String> ApplicationConversionServiceFactoryBean.getProduct_stockToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.roo.team01.domain.Product_stock, java.lang.String>() {
            public String convert(Product_stock product_stock) {
                return new StringBuilder().append(product_stock.getProduct_name()).append(' ').append(product_stock.getProduct_num()).toString();
            }
        };
    }
    
    public Converter<Long, Product_stock> ApplicationConversionServiceFactoryBean.getIdToProduct_stockConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.roo.team01.domain.Product_stock>() {
            public com.roo.team01.domain.Product_stock convert(java.lang.Long id) {
                return Product_stock.findProduct_stock(id);
            }
        };
    }
    
    public Converter<String, Product_stock> ApplicationConversionServiceFactoryBean.getStringToProduct_stockConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.roo.team01.domain.Product_stock>() {
            public com.roo.team01.domain.Product_stock convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Product_stock.class);
            }
        };
    }
    
    public Converter<Promotion, String> ApplicationConversionServiceFactoryBean.getPromotionToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.roo.team01.domain.Promotion, java.lang.String>() {
            public String convert(Promotion promotion) {
                return new StringBuilder().append(promotion.getName()).append(' ').append(promotion.getDetail()).append(' ').append(promotion.getDiscount()).append(' ').append(promotion.getPrice()).toString();
            }
        };
    }
    
    public Converter<Long, Promotion> ApplicationConversionServiceFactoryBean.getIdToPromotionConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.roo.team01.domain.Promotion>() {
            public com.roo.team01.domain.Promotion convert(java.lang.Long id) {
                return Promotion.findPromotion(id);
            }
        };
    }
    
    public Converter<String, Promotion> ApplicationConversionServiceFactoryBean.getStringToPromotionConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.roo.team01.domain.Promotion>() {
            public com.roo.team01.domain.Promotion convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Promotion.class);
            }
        };
    }
    
    public Converter<PurchaseOrder, String> ApplicationConversionServiceFactoryBean.getPurchaseOrderToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.roo.team01.domain.PurchaseOrder, java.lang.String>() {
            public String convert(PurchaseOrder purchaseOrder) {
                return "(no displayable fields)";
            }
        };
    }
    
    public Converter<Long, PurchaseOrder> ApplicationConversionServiceFactoryBean.getIdToPurchaseOrderConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.roo.team01.domain.PurchaseOrder>() {
            public com.roo.team01.domain.PurchaseOrder convert(java.lang.Long id) {
                return PurchaseOrder.findPurchaseOrder(id);
            }
        };
    }
    
    public Converter<String, PurchaseOrder> ApplicationConversionServiceFactoryBean.getStringToPurchaseOrderConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.roo.team01.domain.PurchaseOrder>() {
            public com.roo.team01.domain.PurchaseOrder convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), PurchaseOrder.class);
            }
        };
    }
    
    public Converter<ReserveData, String> ApplicationConversionServiceFactoryBean.getReserveDataToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.roo.team01.domain.ReserveData, java.lang.String>() {
            public String convert(ReserveData reserveData) {
                return new StringBuilder().append(reserveData.getAmount()).append(' ').append(reserveData.getDates()).toString();
            }
        };
    }
    
    public Converter<Long, ReserveData> ApplicationConversionServiceFactoryBean.getIdToReserveDataConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.roo.team01.domain.ReserveData>() {
            public com.roo.team01.domain.ReserveData convert(java.lang.Long id) {
                return ReserveData.findReserveData(id);
            }
        };
    }
    
    public Converter<String, ReserveData> ApplicationConversionServiceFactoryBean.getStringToReserveDataConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.roo.team01.domain.ReserveData>() {
            public com.roo.team01.domain.ReserveData convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), ReserveData.class);
            }
        };
    }
    
    public Converter<Stock_bill, String> ApplicationConversionServiceFactoryBean.getStock_billToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.roo.team01.domain.Stock_bill, java.lang.String>() {
            public String convert(Stock_bill stock_bill) {
                return new StringBuilder().append(stock_bill.getProduct_name()).append(' ').append(stock_bill.getProduct_num()).append(' ').append(stock_bill.getAllproduct_price()).append(' ').append(stock_bill.getDate_pro()).toString();
            }
        };
    }
    
    public Converter<Long, Stock_bill> ApplicationConversionServiceFactoryBean.getIdToStock_billConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.roo.team01.domain.Stock_bill>() {
            public com.roo.team01.domain.Stock_bill convert(java.lang.Long id) {
                return Stock_bill.findStock_bill(id);
            }
        };
    }
    
    public Converter<String, Stock_bill> ApplicationConversionServiceFactoryBean.getStringToStock_billConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.roo.team01.domain.Stock_bill>() {
            public com.roo.team01.domain.Stock_bill convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Stock_bill.class);
            }
        };
    }
    
    public Converter<Total_amount, String> ApplicationConversionServiceFactoryBean.getTotal_amountToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.roo.team01.domain.Total_amount, java.lang.String>() {
            public String convert(Total_amount total_amount) {
                return "(no displayable fields)";
            }
        };
    }
    
    public Converter<Long, Total_amount> ApplicationConversionServiceFactoryBean.getIdToTotal_amountConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.roo.team01.domain.Total_amount>() {
            public com.roo.team01.domain.Total_amount convert(java.lang.Long id) {
                return Total_amount.findTotal_amount(id);
            }
        };
    }
    
    public Converter<String, Total_amount> ApplicationConversionServiceFactoryBean.getStringToTotal_amountConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.roo.team01.domain.Total_amount>() {
            public com.roo.team01.domain.Total_amount convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Total_amount.class);
            }
        };
    }
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(getAdd_PromotionToStringConverter());
        registry.addConverter(getIdToAdd_PromotionConverter());
        registry.addConverter(getStringToAdd_PromotionConverter());
        registry.addConverter(getCommentToStringConverter());
        registry.addConverter(getIdToCommentConverter());
        registry.addConverter(getStringToCommentConverter());
        registry.addConverter(getCustomerToStringConverter());
        registry.addConverter(getIdToCustomerConverter());
        registry.addConverter(getStringToCustomerConverter());
        registry.addConverter(getDeliveryToStringConverter());
        registry.addConverter(getIdToDeliveryConverter());
        registry.addConverter(getStringToDeliveryConverter());
        registry.addConverter(getLogUserToStringConverter());
        registry.addConverter(getIdToLogUserConverter());
        registry.addConverter(getStringToLogUserConverter());
        registry.addConverter(getLogUserRoleToStringConverter());
        registry.addConverter(getIdToLogUserRoleConverter());
        registry.addConverter(getStringToLogUserRoleConverter());
        registry.addConverter(getOrderedToStringConverter());
        registry.addConverter(getIdToOrderedConverter());
        registry.addConverter(getStringToOrderedConverter());
        registry.addConverter(getPaymentToStringConverter());
        registry.addConverter(getIdToPaymentConverter());
        registry.addConverter(getStringToPaymentConverter());
        registry.addConverter(getPostToStringConverter());
        registry.addConverter(getIdToPostConverter());
        registry.addConverter(getStringToPostConverter());
        registry.addConverter(getPreOrderToStringConverter());
        registry.addConverter(getIdToPreOrderConverter());
        registry.addConverter(getStringToPreOrderConverter());
        registry.addConverter(getProductToStringConverter());
        registry.addConverter(getIdToProductConverter());
        registry.addConverter(getStringToProductConverter());
        registry.addConverter(getProduct_stockToStringConverter());
        registry.addConverter(getIdToProduct_stockConverter());
        registry.addConverter(getStringToProduct_stockConverter());
        registry.addConverter(getPromotionToStringConverter());
        registry.addConverter(getIdToPromotionConverter());
        registry.addConverter(getStringToPromotionConverter());
        registry.addConverter(getPurchaseOrderToStringConverter());
        registry.addConverter(getIdToPurchaseOrderConverter());
        registry.addConverter(getStringToPurchaseOrderConverter());
        registry.addConverter(getReserveDataToStringConverter());
        registry.addConverter(getIdToReserveDataConverter());
        registry.addConverter(getStringToReserveDataConverter());
        registry.addConverter(getStock_billToStringConverter());
        registry.addConverter(getIdToStock_billConverter());
        registry.addConverter(getStringToStock_billConverter());
        registry.addConverter(getTotal_amountToStringConverter());
        registry.addConverter(getIdToTotal_amountConverter());
        registry.addConverter(getStringToTotal_amountConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
}