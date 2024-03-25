package Okan.bean_annotation.config;

import Okan.bean_annotation.casefactory.Case;
import Okan.bean_annotation.casefactory.DellCase;
import Okan.bean_annotation.motherboardFactory.AsusMotherboard;
import Okan.bean_annotation.motherboardFactory.Motherboard;
import Okan.bean_annotationmonitorfactory.AcerMonitor;
import Okan.bean_annotationmonitorfactory.Monitor;
import Okan.bean_annotationmonitorfactory.SonyMonitor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class ComputerConfig {
    @Bean(name="sony")
    public Monitor monitorSony(){

        return new SonyMonitor("25 inch Beast","Sony",25);
    }

    @Bean(name="sony2")
    public Monitor monitorSony2(){

        return new SonyMonitor("40 inch Beast","Sony",40);
    }


    @Bean
    @Primary
    public Monitor monitorAcer(){
        return new AcerMonitor("23 inch Beast","Acer",23);
    }


    @Bean
    public Case caseDell(){
        return new DellCase("220B","Dell","240");
    }

    @Bean
    public Motherboard motherboardAsus(){
        return new AsusMotherboard("BJ-200","Asus",4,6,"v2.44");
    }



}
