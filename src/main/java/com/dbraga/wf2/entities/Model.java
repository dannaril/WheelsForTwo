package com.dbraga.wf2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Model {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String year;
	private String model;
	private String power;	
	private String stroke;
	private String torque;
	private String driveline;
	private String rearBrakes;
	private String transmissionType;
	private String fuelSystem;
	private String wheelbase;
	private String colorOptions;
	private String displacement;
	private String gearbox;
	
	@Column(name="front_suspension")
	private String frontSuspension;
	
	@Column(name="front_brakes")
	private String frontBrakes;
	
	@Column(name="cooling_system")
	private String coolingSystem;
	
	@Column(name="seat_height")
	private String seatHeight;
	
	@Column(name="fuel_capacity")
	private String fuelCapacity;
	
	@Column(name="rear_suspension")
	private String rearSuspension;
	
	@Column(name="power_weight_ratio")
	private String powerWeightRatio;
	
	@Column(name="engine_type")
	private String engineType;
	
	@Column(name="dry_weight")
	private String dryWeight;
	
	@Column(name="overall_height")
	private String overallHeight;
	
	@Column(name="overall_length")
	private String overallLength;	
	
	@Column(name="overall_width")
	private String overallWidth;
	
	@Column(name="bore_x_stroke")
	private String boreXstroke;
	
	@Column(name="front_tyre_dimensions")
	private String frontTyreDimensions;
	
	@Column(name="rear_tyre_dimensions")
	private String rearTyreDimensions;
	
	@OneToOne
	private Brand brand;
	
	@OneToOne
	private Category category;
	
	public Model() {
		
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getStroke() {
		return stroke;
	}

	public void setStroke(String stroke) {
		this.stroke = stroke;
	}

	public String getTorque() {
		return torque;
	}

	public void setTorque(String torque) {
		this.torque = torque;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getWheelbase() {
		return wheelbase;
	}

	public void setWheelbase(String wheelbase) {
		this.wheelbase = wheelbase;
	}

	public String getDisplacement() {
		return displacement;
	}

	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}

	public String getPowerWeightRatio() {
		return powerWeightRatio;
	}

	public void setPowerWeightRatio(String powerWeightRatio) {
		this.powerWeightRatio = powerWeightRatio;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getDryWeight() {
		return dryWeight;
	}

	public void setDryWeight(String dryWeight) {
		this.dryWeight = dryWeight;
	}

	public String getOverallHeight() {
		return overallHeight;
	}

	public void setOverallHeight(String overallHeight) {
		this.overallHeight = overallHeight;
	}

	public String getOverallLength() {
		return overallLength;
	}

	public void setOverallLength(String overallLength) {
		this.overallLength = overallLength;
	}

	public String getOverallWidth() {
		return overallWidth;
	}

	public void setOverallWidth(String overallWidth) {
		this.overallWidth = overallWidth;
	}

	public String getBoreXstroke() {
		return boreXstroke;
	}

	public void setBoreXstroke(String boreXstroke) {
		this.boreXstroke = boreXstroke;
	}

	public String getFrontTyreDimensions() {
		return frontTyreDimensions;
	}

	public void setFrontTyreDimensions(String frontTyreDimensions) {
		this.frontTyreDimensions = frontTyreDimensions;
	}

	public String getRearTyreDimensions() {
		return rearTyreDimensions;
	}

	public void setRearTyreDimensions(String rearTyreDimensions) {
		this.rearTyreDimensions = rearTyreDimensions;
	}

	public String getDriveline() {
		return driveline;
	}

	public void setDriveline(String driveline) {
		this.driveline = driveline;
	}

	public String getRearBrakes() {
		return rearBrakes;
	}

	public void setRearBrakes(String rearBrakes) {
		this.rearBrakes = rearBrakes;
	}

	public String getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	public String getFuelSystem() {
		return fuelSystem;
	}

	public void setFuelSystem(String fuelSystem) {
		this.fuelSystem = fuelSystem;
	}

	public String getColorOptions() {
		return colorOptions;
	}

	public void setColorOptions(String colorOptions) {
		this.colorOptions = colorOptions;
	}

	public String getFrontSuspension() {
		return frontSuspension;
	}

	public void setFrontSuspension(String frontSuspension) {
		this.frontSuspension = frontSuspension;
	}

	public String getFrontBrakes() {
		return frontBrakes;
	}

	public void setFrontBrakes(String frontBrakes) {
		this.frontBrakes = frontBrakes;
	}

	public String getCoolingSystem() {
		return coolingSystem;
	}

	public void setCoolingSystem(String coolingSystem) {
		this.coolingSystem = coolingSystem;
	}

	public String getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(String seatHeight) {
		this.seatHeight = seatHeight;
	}

	public String getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(String fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public String getRearSuspension() {
		return rearSuspension;
	}

	public void setRearSuspension(String rearSuspension) {
		this.rearSuspension = rearSuspension;
	}

	public String getGearbox() {
		return gearbox;
	}

	public void setGearbox(String gearbox) {
		this.gearbox = gearbox;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return id + ", "+ model + ", " + year + ", "+ brand;
	}
	
	
	
}
