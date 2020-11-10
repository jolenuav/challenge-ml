package com.challenge.api.models;

import java.io.Serializable;

public class Translation implements Serializable {

	private static final long serialVersionUID = 1447647966079322422L;
	private String de;
	private String es;
	private String fr;
	private String ja;
	private String it;
	private String br;
	private String pt;
	private String nl;
	private String hr;
	private String fa;

	public Translation() {
	}

	public Translation(String de, String es, String fr, String ja, String it, String br, String pt, String nl,
			String hr, String fa) {
		this.de = de;
		this.es = es;
		this.fr = fr;
		this.ja = ja;
		this.it = it;
		this.br = br;
		this.pt = pt;
		this.nl = nl;
		this.hr = hr;
		this.fa = fa;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getEs() {
		return es;
	}

	public void setEs(String es) {
		this.es = es;
	}

	public String getFr() {
		return fr;
	}

	public void setFr(String fr) {
		this.fr = fr;
	}

	public String getJa() {
		return ja;
	}

	public void setJa(String ja) {
		this.ja = ja;
	}

	public String getIt() {
		return it;
	}

	public void setIt(String it) {
		this.it = it;
	}

	public String getBr() {
		return br;
	}

	public void setBr(String br) {
		this.br = br;
	}

	public String getPt() {
		return pt;
	}

	public void setPt(String pt) {
		this.pt = pt;
	}

	public String getNl() {
		return nl;
	}

	public void setNl(String nl) {
		this.nl = nl;
	}

	public String getHr() {
		return hr;
	}

	public void setHr(String hr) {
		this.hr = hr;
	}

	public String getFa() {
		return fa;
	}

	public void setFa(String fa) {
		this.fa = fa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((br == null) ? 0 : br.hashCode());
		result = prime * result + ((de == null) ? 0 : de.hashCode());
		result = prime * result + ((es == null) ? 0 : es.hashCode());
		result = prime * result + ((fa == null) ? 0 : fa.hashCode());
		result = prime * result + ((fr == null) ? 0 : fr.hashCode());
		result = prime * result + ((hr == null) ? 0 : hr.hashCode());
		result = prime * result + ((it == null) ? 0 : it.hashCode());
		result = prime * result + ((ja == null) ? 0 : ja.hashCode());
		result = prime * result + ((nl == null) ? 0 : nl.hashCode());
		result = prime * result + ((pt == null) ? 0 : pt.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Translation other = (Translation) obj;
		if (br == null) {
			if (other.br != null)
				return false;
		} else if (!br.equals(other.br))
			return false;
		if (de == null) {
			if (other.de != null)
				return false;
		} else if (!de.equals(other.de))
			return false;
		if (es == null) {
			if (other.es != null)
				return false;
		} else if (!es.equals(other.es))
			return false;
		if (fa == null) {
			if (other.fa != null)
				return false;
		} else if (!fa.equals(other.fa))
			return false;
		if (fr == null) {
			if (other.fr != null)
				return false;
		} else if (!fr.equals(other.fr))
			return false;
		if (hr == null) {
			if (other.hr != null)
				return false;
		} else if (!hr.equals(other.hr))
			return false;
		if (it == null) {
			if (other.it != null)
				return false;
		} else if (!it.equals(other.it))
			return false;
		if (ja == null) {
			if (other.ja != null)
				return false;
		} else if (!ja.equals(other.ja))
			return false;
		if (nl == null) {
			if (other.nl != null)
				return false;
		} else if (!nl.equals(other.nl))
			return false;
		if (pt == null) {
			if (other.pt != null)
				return false;
		} else if (!pt.equals(other.pt))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Translation [de=");
		builder.append(de);
		builder.append(", es=");
		builder.append(es);
		builder.append(", fr=");
		builder.append(fr);
		builder.append(", ja=");
		builder.append(ja);
		builder.append(", it=");
		builder.append(it);
		builder.append(", br=");
		builder.append(br);
		builder.append(", pt=");
		builder.append(pt);
		builder.append(", nl=");
		builder.append(nl);
		builder.append(", hr=");
		builder.append(hr);
		builder.append(", fa=");
		builder.append(fa);
		builder.append("]");
		return builder.toString();
	}

}
