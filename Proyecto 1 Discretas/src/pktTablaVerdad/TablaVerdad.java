package pktTablaVerdad;
import java.util.Scanner;
public class TablaVerdad 
{

	public static void main(String[] args)
	{
		 String proposicion;
		 int control=0;
		 boolean p=true, q=true;
		Scanner objLeer = new Scanner (System.in);
		TablaVerdad objLlamar=  new TablaVerdad();
		
		System.out.println("<<<<<<BIENVENIDO>>>>>>");
		System.out.println("Para esta tabla de la verdad utilice la siguiente simbología\n"
				+ "Para las Variables utilice las letras 'p' y 'q'\n"
				+ "Para la Conjuncion utilice: '^'\n"
				+ "Para la Disyunción utilice 'v'\n"
				+ "Para el Si...Entonces utilice '->'\n"
				+ "Para el Si Y Solo Si utilice '<->'\n"
				+ "Para la Negación utilice '!'\n"
				+ "Utilice los parentesis donde sea conveniente\n"
				+ "EJEMPLO:!(p->q)");
		do {
		System.out.println("|Ingrese la proposición|");
		proposicion=objLeer.next();
		System.out.println("|  p\t|  q\t| "+proposicion+"\t|");
		System.out.println("---------------------------");
		if(proposicion.contains("!p")==true)
		{
			if(proposicion.contains("^")==true)
			{
				System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoY(!p, q)+"\t|");
				p=true;q=false;
				System.out.println("| "+p+"\t|" +q+"\t| "+objLlamar.metodoY(!p, q)+" | ");
				p=false;q=true;
				System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoY(!p, q)+" | ");
				p=false;q=false;
				System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoY(!p, q)+" | ");
			}
			else 
				if(proposicion.contains("v")==true)
				{
					System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoO(!p, q)+"\t| ");
					p=true;q=false;
					System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoO(!p, q)+" | ");
					p=false;q=true;
					System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoO(!p, q)+" |  ");
					p=false;q=false;
					System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoO(!p, q)+" | ");
				}
				else 
					if(proposicion.contains("->")==true)
					{
						System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSi(!p, q)+"\t| ");
						p=true;q=false;
						System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSi(!p, q)+" | ");
						p=false;q=true;
						System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSi(!p, q)+" |  ");
						p=false;q=false;
						System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSi(!p, q)+" | ");
					}
					else 
						if(proposicion.contains("<->")==true)
						{
							System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSoloSi(!p, q)+"\t| ");
							p=true;q=false;
							System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSoloSi(!p, q)+" | ");
							p=false;q=true;
							System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSoloSi(!p, q)+" |  ");
							p=false;q=false;
							System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSoloSi(!p, q)+" | ");
						}
		}
		else 
			if(proposicion.contains("!q")==true)
			{
				if(proposicion.contains("^")==true)
				{
					System.out.println("| "+p+"\t|"+q+"\t| "+objLlamar.metodoY(p, !q)+"\t|");
					p=true;q=false;
					System.out.println("| "+p+"\t|" +q+"\t| "+objLlamar.metodoY(p, !q)+" | ");
					p=false;q=true;
					System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoY(p, !q)+" | ");
					p=false;q=false;
					System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoY(p, !q)+" | ");
				}
				else 
					if(proposicion.contains("v")==true)
					{
						System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoO(p, !q)+"\t| ");
						p=true;q=false;
						System.out.println("| "+p+"\t| "+q+" \t| "+objLlamar.metodoO(p, !q)+" | ");
						p=false;q=true;
						System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoO(p, !q)+" |  ");
						p=false;q=false;
						System.out.println("| "+p+" | "+q+" | "+objLlamar.metodoO(p, !q)+" | ");
					}
					else 
						if(proposicion.contains("->")==true)
						{
							System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSi(p, !q)+"\t| ");
							p=true;q=false;
							System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSi(p, !q)+" | ");
							p=false;q=true;
							System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSi(p, !q)+" |  ");
							p=false;q=false;
							System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSi(p, !q)+" | ");
						}
						else 
							if(proposicion.contains("<->")==true)
							{
								System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSoloSi(p, !q)+"\t| ");
								p=true;q=false;
								System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSoloSi(p, !q)+" | ");
								p=false;q=true;
								System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSoloSi(p, !q)+" |  ");
								p=false;q=false;
								System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSoloSi(p, !q)+" | ");
							}
			}
			else 
				if(proposicion.contains("!(")==true)
						{
					if(proposicion.contains("^")==true)
					{
						System.out.println("| "+p+"\t|"+q+"\t| "+!(objLlamar.metodoY(p, q))+"\t|");
						p=true;q=false;
						System.out.println("| "+p+"\t|" +q+"\t| "+!(objLlamar.metodoY(p, q))+" | ");
						p=false;q=true;
						System.out.println("| "+p+"\t| "+q+"\t| "+!(objLlamar.metodoY(p, q))+" | ");
						p=false;q=false;
						System.out.println("| "+p+"\t| "+q+"\t| "+!(objLlamar.metodoY(p, q))+" | ");
					}
					else 
						if(proposicion.contains("v")==true)
						{
							System.out.println("| "+p+"\t| "+q+"\t| "+!(objLlamar.metodoO(p, q))+"\t| ");
							p=true;q=false;
							System.out.println("| "+p+"\t| "+q+"\t| "+!(objLlamar.metodoO(p, q))+" | ");
							p=false;q=true;
							System.out.println("| "+p+"\t| "+q+"\t| "+!(objLlamar.metodoO(p, q))+" |  ");
							p=false;q=false;
							System.out.println("| "+p+"\t| "+q+"\t| "+!(objLlamar.metodoO(p, q))+" | ");
						}
						else 
							if(proposicion.contains("->")==true)
							{
								System.out.println("| "+p+"\t| "+q+"\t| "+!(objLlamar.metodoSi(p, q))+"\t| ");
								p=true;q=false;
								System.out.println("| "+p+"\t| "+q+"\t| "+!(objLlamar.metodoSi(p, q))+" | ");
								p=false;q=true;
								System.out.println("| "+p+"\t| "+q+"\t| "+!(objLlamar.metodoSi(p, q))+" |  ");
								p=false;q=false;
								System.out.println("| "+p+"\t| "+q+"\t| "+!(objLlamar.metodoSi(p, q))+" | ");
							}
							else 
								if(proposicion.contains("<->")==true)
								{
									System.out.println("| "+p+"\t| "+q+"\t| "+!(objLlamar.metodoSoloSi(p, q))+"\t| ");
									p=true;q=false;
									System.out.println("| "+p+"\t| "+q+"\t| "+!(objLlamar.metodoSoloSi(p, q))+" | ");
									p=false;q=true;
									System.out.println("| "+p+"\t| "+q+"\t| "+!(objLlamar.metodoSoloSi(p, q))+" |  ");
									p=false;q=false;
									System.out.println("| "+p+"\t| "+q+"\t| "+!(objLlamar.metodoSoloSi(p, q))+" | ");
								}
					
						}
		else 
		if(proposicion.contains("^")==true)
		{
			System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoY(p, q)+"\t|");
			p=true;q=false;
			System.out.println("| "+p+"\t| " +q+"\t| "+objLlamar.metodoY(p, q)+" | ");
			p=false;q=true;
			System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoY(p, q)+" | ");
			p=false;q=false;
			System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoY(p, q)+" | ");
		}
		else 
			if(proposicion.contains("v")==true)
			{
				System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoO(p, q)+"\t| ");
				p=true;q=false;
				System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoO(p, q)+" | ");
				p=false;q=true;
				System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoO(p, q)+" |  ");
				p=false;q=false;
				System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoO(p, q)+" | ");
			}
			else 
				if(proposicion.contains("->")==true)
				{
					System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSi(p, q)+"\t| ");
					p=true;q=false;
					System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSi(p, q)+" | ");
					p=false;q=true;
					System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSi(p, q)+" |  ");
					p=false;q=false;
					System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSi(p, q)+" | ");
				}
				else 
					if(proposicion.contains("<->")==true)
					{
						System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSoloSi(p, q)+"\t| ");
						p=true;q=false;
						System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSoloSi(p, q)+" | ");
						p=false;q=true;
						System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSoloSi(p, q)+" |  ");
						p=false;q=false;
						System.out.println("| "+p+"\t| "+q+"\t| "+objLlamar.metodoSoloSi(p, q)+" | ");
					}
		System.out.println("Si desea continuar ingrese 0\n"
				+ "Si desea salir ingese 1\n");
		control=objLeer.nextInt();
		}while(control==0);
		
		

	}
	
	 public boolean metodoSi(boolean p, boolean q)
	 {
		 boolean operacion;
		 if((p==true&& q==false)||(p==false && q==false ))
			 operacion=!(p|q);
		 else
			 operacion=(p|q);
		 return operacion;
	 }
	 public boolean metodoY(boolean p, boolean q)
	 {
		 boolean operacion;
		 operacion=p&&q;
		 return operacion;
	 }
	 public boolean metodoO(boolean p, boolean q)
	 {
		 boolean operacion;
		 operacion=p||q;
		 return operacion;
	 }
	 public boolean metodoSoloSi(boolean p, boolean q)
	 {
		 boolean operacion;
		 operacion=!(p^q);
		 return operacion;
	 }

}
