package com.app.BeanInfo;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.app.bean.Actor;
import com.app.connectdb.Database;

public class Car {
	private Integer id;
	private String name;
	private String phone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Map<String, Object>> getListData() {
		Database db = new Database();
		String sql = "select * from actor";

		List<Map<String, Object>> result = db.queryList(sql, null);

		// for (Map<String, Object> row : result) {
		// System.out.println((Integer) row.get("actor_id"));
		// System.out.println((String) row.get("first_name"));
		// }
		// Object[] keys = result.get(0).keySet().toArray();
		return result;

	}

	public static void main(String[] args) {
		try {
			List<Actor> actor = new ArrayList<>();
			BeanInfo info;
			Car car = new Car();
			List<Map<String, Object>> result = car.getListData();
			
			Object[] keys = result.get(0).keySet().toArray();
			
			List<Object> listAT = createListFromMapEntries( result.get(0) );
			
			List<Actor> list = new ArrayList<Actor>();
//			for(int a=0; a<result.size(); a++){
//				for(int j=0; j<keys.length; j++){
//					System.out.println( result.get(a).values().toArray()[j] );
//				}
//			}
			for (Object row : listAT) {
				list.add((Actor) row);
			}
			
			

			Actor ac = new Actor();
			 List<Actor> listAct = cast(result);
			    for(int i=0; i<listAct.size(); i++){
//			    	System.out.println(listAct.get(i));
			    }
		    
//			Field[] fields = ac.getClass().getDeclaredFields();
//			Actor act = null;
//			for (Field f : fields) {
//				if (!f.isAccessible()) {
//					f.setAccessible(true);
//
////					Class<?> type = f.getType();
//					for (Map<String, Object> row : result) {
//						for(int i=0; i<keys.length; i++){
//							if(f.getName().equalsIgnoreCase(keys[i].toString()) && f.getType().equals(String.class)){
//								act = ac.getClass().newInstance();
//								f.set(act, row.get( f.getName() ));
////								System.out.println(f.get(act));
//								actor.add(act);
//							}
//							
//						}
//						
//					}
//					f.setAccessible(false);
//				}
//			}
//			System.out.println(actor.size());
//			for(int j=0; j<actor.size(); j++){
//				System.out.println(actor.get(j).getFirst_name()+", "+actor.get(j).getLast_name());
//			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static <K, V>  List<V> createListFromMapEntries (Map<K, V> map){
        return map.values().stream().collect(Collectors.toList());
    }
	public static <T extends List<?>> T cast(Object obj) {
	    return (T) obj;
	}
	
	
	public String listmap_to_json_string(List<Map<String, Object>> list){       
	    JSONArray json_arr=new JSONArray();
	    for (Map<String, Object> map : list) {
	        JSONObject json_obj=new JSONObject();
	        for (Map.Entry<String, Object> entry : map.entrySet()) {
	            String key = entry.getKey();
	            Object value = entry.getValue();
	            try {
	                json_obj.put(key,value);
	            } catch (JSONException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }                           
	        }
	        json_arr.put(json_obj);
	    }
	    return json_arr.toString();
	}
	public void getReflection() {
		BeanInfo info;
		try {
			Car car = new Car();
			List<Map<String, Object>> result = car.getListData();

			Actor c = new Actor();
			Field[] fields = c.getClass().getDeclaredFields();

			info = Introspector.getBeanInfo(Actor.class);
			PropertyDescriptor[] pds = info.getPropertyDescriptors();
			for (int i = 0; i < pds.length; i++) {
				if (!pds[i].getName().equalsIgnoreCase("class")) {

					for (Field f : fields) {
						if (!f.isAccessible()) {
							f.setAccessible(true);

							Class<?> type = f.getType();

							if (f.getName().equalsIgnoreCase(pds[i].getName()) && type.equals(String.class)) {
								f.set(c, "Saengkhunthod");
								// System.out.println(f.getName() + " : " +
								// f.get(c));
							}

							// if (type.equals(Integer.class)) {
							// f.set(c, 100);
							//
							// } else if (type.equals(String.class)) {
							// if (f.getName().equalsIgnoreCase("name")) {
							// f.set(c, "Saengkhunthod");
							// }
							//
							// } else if (type.equals(Date.class)) {
							// f.set(c, new Date());
							// }

							f.setAccessible(false);
						}

					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}