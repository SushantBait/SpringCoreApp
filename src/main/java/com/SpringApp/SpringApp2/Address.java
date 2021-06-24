package com.SpringApp.SpringApp2;

public class Address {
	    private String house;
		private String city;
		private String state;
		private String country;

		public Address() {
		
		}
		public Address(String house, String city, String state, String country) {
			this.house = house;
			this.city = city;
			this.state = state;
			this.country = country;
		}
		public String getHouse() {
			return house;
		}
		public void setHouse(String house) {
			this.house = house;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		@Override
		public String toString() {
			return "Address [house=" + house + ", city=" + city + ", state=" + state + ", country=" + country + "]";
		}
		
}
