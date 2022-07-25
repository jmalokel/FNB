package question7;

public enum Element {

    HELIUM("He","Gas"),
    MAGNESIUM("Mg","Solid");

    private String chemicalSymbol;
    private String nature;

    private Element(String newChemicalSymbol, String newNature)
    {
        chemicalSymbol = newChemicalSymbol;
        nature = newNature;
    }

    public String getChemicalSymbol()
    {
        return chemicalSymbol;
    }

    public String getNature()
    {
        return nature;
    }

    public static void main(String[] args) {
        System.out.printf("%s,%s,%s", Element.HELIUM,Element.HELIUM.getChemicalSymbol(),Element.HELIUM.getNature());
    }
}
