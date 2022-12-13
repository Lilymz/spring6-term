package com.zjmx.core.spring.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author zhangjie
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {

    @Serial
    private static final long serialVersionUID = 134812515386683006L;

    private String book;
    private String isbn;
    private BigDecimal price;
}
