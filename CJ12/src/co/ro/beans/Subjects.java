package co.ro.beans;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
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
