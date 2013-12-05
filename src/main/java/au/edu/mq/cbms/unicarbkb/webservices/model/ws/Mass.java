package au.edu.mq.cbms.unicarbkb.webservices.model.ws;

import java.util.Collections;
import java.util.Comparator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "mass")
@XmlAccessorType (XmlAccessType.FIELD)
public class Mass implements Comparable<Mass>{
	@XmlAttribute (required = true)
	private double mz;
	@XmlAttribute (required = true)
	private double intensity;
	/**
	 * @return the mz
	 */
	public double getMz() {
		return mz;
	}
	/**
	 * @param d the mz to set
	 */
	public void setMz(double d) {
		
		this.mz = d;
	}
	/**
	 * @return the intensity
	 */
	public double getIntensity() {
		return intensity;
	}
	/**
	 * @param intensity the intensity to set
	 */
	public void setIntensity(double intensity) {
		this.intensity = intensity;
	}
	@Override
	public int compareTo(Mass o) {
		// TODO Auto-generated method stub
		double intensityDiff =  this.intensity-o.intensity;
		if (intensityDiff!=0) 
			return (int)intensityDiff;
		return (int)(this.mz-o.mz);
	}

}
