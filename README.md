# scala-sterketyper
En oppgave på miniworkshop i PET-prosjektet i Oslo kommune, januar 2018


# Problemdomenet

I Oslo kommune er det slik at at når man skal starte en pub så må ledelsen i firmet ha bestått noen prøver om lover og regler for drift av skjenkesteder:
* Etablererprøven: For å få serveringsbevilling kreves det at daglig leder har bestått Etablererprøven for serveringsvirksomhet.
* Kunnskapsprøven - skjenkebevilling: For å få skjenkebevilling kreves det at styrer og stedfortreder har bestått Kunnskapsprøven i alkoholloven for skjenkebevilling.
* Kunnskapsprøven - salgsbevilling: For å få salgsbevilling kreves det at styrer og stedfortreder har bestått Kunnskapsprøven i alkoholloven for salgsbevilling.

# Målet for øvingsoppgaven

Vi skal lage en funksjon som skal ta informasjon om avlagte prøver og svare på om minst én av dem har blitt avlagt i Oslo kommune.

Utfordringer er ikke logikken i denne funksjonen, for det er enkelt. Hovedpoenget i oppgaver er hvordan inputen - parametrene - til denne funksjonen skal modelleres.

Målet er å skrive "idiotsikker" kode og følge prisnippet "make illegal states unrepresentable". Vi vet at andre utviklere vil komme og tukle med koden vår i framtida. Hvordan kan vi modellere inputen slik at vi minimerer mulighetsrommet for feil? 


# Detaljer

Se gitte testklasse. Der er det noen tester for scenarier som aldri bør forekomme. Fyll ut den manglende prodkoden slik at Ovingsoppgave.enErAvlagtIOslo() ikke trenger å tenke på disse scenariene: De ugyldige tilstandene skal være umulig å gi i parametrene. 