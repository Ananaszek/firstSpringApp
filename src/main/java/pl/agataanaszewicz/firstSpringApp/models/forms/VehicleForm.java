package pl.agataanaszewicz.firstSpringApp.models.forms;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class VehicleForm {
    @Min(1900)
    @Max(2017)
    public int productionYear;
    @NotBlank
    @Size(min = 3, max = 30)
    public String mark;
    @NotBlank
    @Size(min = 3, max = 50)
    public String model;


    public VehicleForm(int productionYear, String mark, String model) {
        this.productionYear = productionYear;
        this.mark = mark;
        this.model = model;
    }

    public VehicleForm() { }


    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
