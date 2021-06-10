Algoritmo Ejercicio6
	Definir N, menores, mayores, numero_personasm, numero_personasMAy Como Entero
	
	menores=0
	mayores=0
	numero_personasm=0
	numero_personasMAy=0
	
	
	Para i<-1 Hasta 100 Con Paso 1 Hacer
		Escribir "Ingrese edades"
		Leer N 
		si N<25 Entonces
			menores=menores+N
			numero_personasm=numero_personasm+1
			promedio1=menores/numero_personasm
		FinSi
		si N>25 Entonces
			mayores=mayores+N
			numero_personasMAy=numero_peronsasMAy+1
			promedio2=mayores/numero_personasM
		FinSi
		
	FinPara
	Escribir "El promedio de edad que tienen las personas menores a 25 años es = " promedio1;
	Escribir "El promedio de edad que tienen las personas mayores a 25 años es = " promedio2;
FinAlgoritmo
