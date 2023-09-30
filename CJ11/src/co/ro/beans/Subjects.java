package co.ro.beans;

import java.util.List;

public class Subjects {
	private List<String> subj;

	

	public void setSubj(List<String> subj) {
		this.subj = subj;
	}



	@Override
	public String toString() {
		return "Subjects [subj=" + subj + "]";
	}

}
