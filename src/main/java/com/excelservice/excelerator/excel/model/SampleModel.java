package com.excelservice.excelerator.excel.model;

import com.excelservice.excelerator.excel.annotation.Column;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SampleModel {

    @Column(name="name")
    String name;

    @Column(name="Sub_Component")
    String subComponent;

    @Column(name="Component_HRL")
    String componentHrl;

    @Column(name="Position")
    String position;

    @Column(name="asofdate", pattern = "dd/MM/yyyy")
    Date asOfDate;
}
