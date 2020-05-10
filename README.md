**Kreirati aplikaciju koji će imati korisnički interfejs kao što je dato na slici i sledeću funkcionalnost:**

-	Javnu klasu Fudbaler koja može da bude serijalizovana i ima:
-	Privatni atribut imePrezime. Vrednost za ovaj atribut je uvek u formatu “IME PREZIME”.
-	Privatni atribut golovi koji predstavlja ukupan broj golova koje je fudbaler postigao u sezoni.
-	Odgovarajuće javne get i set metode za ove atribute. Nedozvoljene vrednosti za atribut imePrezime su null i prazan String, a broj golova može biti nula ili veći od nule. U slučaju unosa nedozvoljenih vrednosti, baciti izuzetak klase SportException sa odgovarajućom porukom.
-	Redefinisanu toString metodu klase Object koja vraća String sa svim podacima o fudbaleru uz odgovarajuću poruku.
-	Javnu klasu SportException koja predstavlja neproveravani izuzetak (nasleđuje klasu RuntimeException) i ima :
-	Javni konstruktor koji kao parametar prima poruku greške i poziva odgovarajući konstruktor nadklase prosleđujući mu parametar.
-	Klasa FudbaleriGUI bi trebalo da sadrži i privatni atribut fudbaleri koji predstavlja listu objekata klase Fudbaler. Odmah inicijalizovati listu.
-	Kada se pritisne dugme “Obrisi”, briše se sadržaj editora.
-	Kada se pritisne dugme “Ucitaj”, učitavaju se (deserijalizuju) svi podaci o fudbalerima iz fajla “fudbaleri.txt” i puni se lista. Pre učitavanja je potrebno izbrisati listu. U listu se unose samo oni fudbaleri iz fajla koji imaju makar 3 data gola.
-	Kada se pritisne dugme “Ispisi”, u editoru se ispisuje izveštaj o fudbalskoj sezoni koji se sastoji iz više delova. Prvo bi trebalo ispisati sve podatke najuspešnijem strelcu sezone (to je onaj fudbaler koji je dao najviše golova). Nakon toga, potrebno je ispisati u editoru za koje nagrade se ovaj fudbaler kvalifikovao. Nazivi nagrada i broj golova koji su potrebni da bi se osvojile su dati u data fajlu “nagrade.txt” i to u formatu: naziv_nagrade - broj_golova

![7](https://scontent.fbeg6-1.fna.fbcdn.net/v/t1.15752-9/96368734_237269984391211_2221838559915016192_n.png?_nc_cat=105&_nc_sid=b96e70&_nc_eui2=AeGmH6i-NpwEFWdyCt8G6fKdprRqhnvJ5iumtGqGe8nmK30nGJt9Xg_r1gr_wNYRzXg&_nc_ohc=NTZgeinHMFkAX8SY5Iu&_nc_ht=scontent.fbeg6-1.fna&oh=b9392e020c78bad07445d60b93829062&oe=5EDBC307)
