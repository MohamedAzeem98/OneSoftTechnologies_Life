package arrayList;

import java.util.ArrayList;

public class UseEngineeringStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EngineeringStudent stud1=new EngineeringStudent("AjayKumar",25,23,55000,true);
		
		EngineeringStudent stud2=new EngineeringStudent("Barath",26,14,66400,true);
		
		EngineeringStudent stud3=new EngineeringStudent("Cyril",17,18,50000,true);
		
		EngineeringStudent stud4=new EngineeringStudent("DevaKumari",28,19,63000,false);
		
		EngineeringStudent stud5=new EngineeringStudent("Eswari",28,20,78000,false);
		
		
		ArrayList<EngineeringStudent>st=new ArrayList<>();
		
		st.add(stud1);
		st.add(stud2);
		st.add(stud3);
		st.add(stud4);
		st.add(stud5);
		
	/*	for(int i=0;i<st.size();i++) {
			System.out.println(st.get(i).getName());
		}
		//System.out.println();
		
		for(EngineeringStudent e:st) {
			System.out.println();
			System.out.println(e);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=0;i<st.size();i++) {
			if(st.get(i).getAge()>18) {
		System.out.println(st.get(i).getName());
			}
		}
		
		
		
		st.forEach(x->System.out.println(x));
		
		for(int i=0;i<st.size();i++) {
			if(st.get(i).getName().startsWith("A")) {
				System.out.println(st.get(i));
			}
		}
		
		int min=st.get(3).getName().length();
		String s="";
		
		for(int i=0;i<st.size();i++) {
			if(st.get(i).getName().length()<min) {
				min=st.get(i).getName().length();
				s=st.get(i).getName();
				System.out.println();
				System.out.println(st.get(i));
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(s);
		
		
		
		
		for(int i=0;i<st.size();i++) {
			if(st.get(i).getName().contains("ra")) {
				System.out.println(st.get(i).getName());
			}
			*/
			
			
			//ARRAY LIST -> ARRAY LIST 
		
		/*ArrayList<EngineeringStudent>femaleList=new ArrayList<>();
		
		for(EngineeringStudent s:st) {
			if(s.getIsMale()==false) {
				femaleList.add(s);
			}
		}
		femaleList.forEach(x->System.out.println(x));
		*/
		
		
		/*ArrayList<EngineeringStudent>feesStructure=new ArrayList<>();
		
		for(EngineeringStudent t:st) {
			if(t.getFees()>59000) {
				feesStructure.add(t);
			}
		}
		feesStructure.forEach(x->System.out.println(x));
		*/
		
		ArrayList<EngineeringStudent>namingMore=new ArrayList<>();
		
		
		for(EngineeringStudent r:st) {
			if(r.getName().length()>3) {
				namingMore.add(r);
			}
		}
		namingMore.forEach(x->System.out.println(x.getName()));
		
		ArrayList<EngineeringStudent>vr=new ArrayList<>();
		
		for(EngineeringStudent ty:st) {
			if(ty.getId()>=17) {
				vr.add(ty);
			}
		}
		vr.forEach(x->System.out.println(x.getName()+" has id above 17  and his Id no "+x.getId()));
		
			ArrayList<EngineeringStudent>agePref=new ArrayList<>();
		for(EngineeringStudent tt:st) {
			if(tt.getAge()<=25) {
				agePref.add(tt);
			}
		}
		System.out.println();
		agePref.forEach(x->System.out.println(x.getName()+" has an age below 25"));
		
	}
	
	}


