package cn.swjd.entries;

public class Student {
	//����ѧ��
		private  Integer st_no;
		//�������Ա����䣬�绰  ����ַ
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
