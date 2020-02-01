package cn.swjd.entries;

public class Student {
	//主键学号
		private  Integer st_no;
		//姓名，性别，年龄，电话  ，地址
		private String st_name, sex, tel, address;
		public Integer getSt_no() {
			return st_no;
		}
		public void setSt_no(Integer st_no) {
			this.st_no = st_no;
		}
		public String getSt_name() {
			return st_name;
		}
		public void setSt_name(String st_name) {
			this.st_name = st_name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		 @Override
		public String toString() {
			return "Student [st_no=" + st_no + ", st_name=" + st_name + ", sex="
					+ sex + ", tel=" + tel + ", address=" + address + "]";

		 }
}
