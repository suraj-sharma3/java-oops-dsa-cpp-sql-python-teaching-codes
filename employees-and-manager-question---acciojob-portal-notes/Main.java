/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}


int solve(String ceo, Map<String, List<String>> mngr, Map<String, Integer> ans){ // recursive function to obtain the number of employees under the CEO 
		// this recursive function 'solve' will insert the employee (manager) & the number of employees under that employee in the ans TreeMap
		// the first call of the solve function will be on the CEO i.e, the employee who is his own manager
		
		if(mngr.containsKey(ceo) == false){ // Base case of recursive function 'solve'
		// this condition would check if an employee which is passed as ceo to the solve function is present in the mngr map as the key (i.e, manager) or not	
			ans.put(ceo, 0); // if the passed employee is not present in the mngr map as a key (manager)
		// then we'll put that employee as the key & the employees under that employee as 0 in the ans TreeMap
			return 1; // we'll return 1 to the solve function which means we're returning the count of employee for the employee that was passed as ceo to the solve function
		}
		
		
		int count = 0; // to get the count of employees under CEO
		for(String emp : mngr.get(ceo)){ // we'll pick each employee from the list of employees under each manager in the mngr map
			count += solve(emp, mngr, ans); // this will return the count of employees under an employee which is passed as the ceo to the solve function
		}
		ans.put(ceo, count); // we'll add the employee passed as ceo as the manager & the employees under him to the ans TreeMap
		return count + 1; // this will return the count of employees under an employee plus that employee to the manager of that employee 	
	}
	
	public void EmpUnderManager(Map<String, String> emp)
	{
		// we already have an "emp" (employee map) which has been to the function as a parameter 
		// the employee map contains employees as keys & their managers as values
		// create a "mngr" (manager map) which contains managers as keys & their employees as values
		Map<String, List<String>> mngr = new HashMap<>();
		String ceo = ""; // CEO is that employee which reports to itself i.e, that employee which is it's own manager
		for(String employee : emp.keySet()){ // iterating over all the employees present in the emp map
			String manager = emp.get(employee); // this would give the manager for an employee from the emp map
			if(manager == employee){ // if an employee is it's own manager, that employee is the CEO 
				ceo = manager;
				continue;
			}

			if(mngr.containsKey(manager)){ // if the mngr map already contains the current manager that we've grabbed 
				List<String> oldEmpList = mngr.get(manager); //  we'll grab the list of all the employees of that manager
				oldEmpList.add(employee); // add the current employee to the list of all the employees
				mngr.put(manager, oldEmpList); // put the manager & the updated list of employees in the mngr map
			}
			else{ // if the mngr map doesn't contains the current manager that we've grabbed 
				List<String> newEmpList = new ArrayList<>(); // we'll make a new list of employees for this manager as it is not present in the mngr map
				newEmpList.add(employee); // add the current employee to this new empty list of employees
				mngr.put(manager, newEmpList); // put this current manager & it's new list of employees in the mngr map
			}
		}
		Map<String, Integer> ans = new TreeMap<>(); // as we need the keys in sorted order
		// it is given in the question that the managers should be sorted in a lexical order in the answer, that's why we would have to use a TreeMap
		solve(ceo, mngr, ans); // solve is a recursive function that would help us build our treemap 'ans'
		// ceo, mngr map & ans map will be passed as parameters to solve (recursive function)

		for(String key : ans.keySet()){ // for each loop for iterating the 'ans' treemap & printing all it'e key value pairs
			System.out.println(key + " " + ans.get(key));
		}
		
	}