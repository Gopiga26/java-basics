package practice2;

public class Student {
  int sid,graduationyear;
  String sname,dept,stream,mobileno;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public int getGraduationyear() {
	return graduationyear;
}
public void setGraduationyear(int graduationyear) {
	this.graduationyear = graduationyear;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", graduationyear=" + graduationyear + ", sname=" + sname + ", dept=" + dept
			+ ", stream=" + stream + ", mobileno=" + mobileno + "]";
}

}
