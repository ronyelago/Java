package curso4.capitulo7.exercicio3;

public class Data
{
    // Construtor
    public Data(int dia, int mes, int ano)
    {
        if (isValidDate(dia, mes, ano))
        {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    // Atributos
    private int dia = 1,
                mes = 1,
                ano = 1900;

    public int getDia()
    {
        return this.dia;
    }
    public void setDia(int dia)
    {
        if (dia <= 31 && dia > 0)
        {
            if (dia <= getMaxDiaMes(this.mes, this.ano))
            {
                this.dia = dia;
            }
        }
    }

    public int getMes()
    {
        return this.mes;
    }
    public void setMes(int mes)
    {
        if (isValidDate(this.dia, mes, this.ano))
            this.mes = mes;
    }

    public int getAno()
    {
        return this.ano;
    }
    public void setAno(int ano)
    {
        if (isValidDate(this.dia, this.mes, ano))
            this.ano = ano;
    }

    public boolean isValidDate(int dia, int mes, int ano)
    {
        if (dia <= 31 && mes <= 12 && (ano <= 9999 && ano >= 1900))
            if (dia == 31)
                if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                    return true;
                else
                    return false;
            else if (dia == 30)
                if (mes != 2)
                    return true;
                else
                    return false;
            else if (dia == 29 && mes == 2)
                if (isAnoBissexto(ano))
                    return true;
                else
                    return false;
            else
                return true;
        else
            return false;
    }

    public boolean isAnoBissexto(int ano)
    {
        if ((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0))
            return true;
        else
            return false;
    }

    public String getDiaSemana()
    {
        int dia = this.dia,
            mes = this.mes,
            ano = this.ano;

        if (this.mes == 1)
        {
            mes = 13;
            ano -= 1;
        }
        if (this.mes == 2)
        {
            mes = 14;
            ano -= 1;
        }

        int k = dia + 2 * mes + ((3 * (mes + 1)) / 5) + ano + (ano / 4) - (ano / 100) + (ano / 400) + 2;
        int diaSemana = k % 7;

        if (diaSemana == 0)
            return "S\u00e1bado";
        else if (diaSemana == 1)
            return "Domingo";
        else if (diaSemana == 2)
            return "Segunda-Feira";
        else if (diaSemana == 3)
            return "Ter\u00e7a-Feira";
        else if (diaSemana == 4)
            return "Quarta-Feira";
        else if (diaSemana == 5)
            return "Quinta-Feira";
        else
            return "Sexta-feira";
    }

    public String getDataExtenso()
    {
        String diaExtenso = " de",
               mesExtenso = " de",
               anoExtenso = " Mil";

        // Verifica se há unidades e se ela não está entre 11 e 19.
        if ((this.dia % 10) != 0 && !(this.dia >= 11 && this.dia <= 19))
        {
            // Verifica qual é a unidade.
            if ((this.dia % 10) == 1)
                diaExtenso = "Um" + diaExtenso;
            else if ((this.dia % 10) == 2)
                diaExtenso = "Dois" + diaExtenso;
            else if ((this.dia % 10) == 3)
                diaExtenso = "Tr\u00eas" + diaExtenso;
            else if ((this.dia % 10) == 4)
                diaExtenso = "Quatro" + diaExtenso;
            else if ((this.dia % 10) == 5)
                diaExtenso = "Cinco" + diaExtenso;
            else if ((this.dia % 10) == 6)
                diaExtenso = "Seis" + diaExtenso;
            else if ((this.dia % 10) == 7)
                diaExtenso = "Sete" + diaExtenso;
            else if ((this.dia % 10) == 8)
                diaExtenso = "Oito" + diaExtenso;
            else if ((this.dia % 10) == 9)
                diaExtenso = "Nove" + diaExtenso;
        }

        // Verifica se não há unidade
        if (this.dia % 10 == 0)
        {
            // Verifica qual a dezena.
            if ((this.dia / 10) == 1)
                diaExtenso = "Dez" + diaExtenso;
            else if ((this.dia / 10) == 2)
                diaExtenso = "Vinte" + diaExtenso;
            else if ((this.dia / 10) == 3)
                diaExtenso = "Trinta" + diaExtenso;
        }
        else
        {
            // Se houver unidade, coloca a letra "e" após a dezena
            if ((this.dia / 10) == 2)
                diaExtenso = "Vinte e " + diaExtenso;
            else if ((this.dia / 10) == 3)
                diaExtenso = "Trinta e " + diaExtenso;
        }

        // Verifica se o dia está entre 11 e 19
        if ((this.dia / 10) == 1 && (this.dia % 10) != 0)
        {
            if ((this.dia % 10) == 1)
                diaExtenso = "Onze" + diaExtenso;
            else if ((this.dia % 10) == 2)
                diaExtenso = "Doze" + diaExtenso;
            else if ((this.dia % 10) == 3)
                diaExtenso = "Treze" + diaExtenso;
            else if ((this.dia % 10) == 4)
                diaExtenso = "Quatorze" + diaExtenso;
            else if ((this.dia % 10) == 5)
                diaExtenso = "Quinze" + diaExtenso;
            else if ((this.dia % 10) == 6)
                diaExtenso = "Dezesseis" + diaExtenso;
            else if ((this.dia % 10) == 7)
                diaExtenso = "Dezessete" + diaExtenso;
            else if ((this.dia % 10) == 8)
                diaExtenso = "Dezoito" + diaExtenso;
            else if ((this.dia % 10) == 9)
                diaExtenso = "Dezenove" + diaExtenso;
        }

        switch(getMes())
        {
            case 1:
                mesExtenso = " Janeiro" + mesExtenso;
                break;
            case 2:
                mesExtenso = " Fevereiro" + mesExtenso;
                break;
            case 3:
                mesExtenso = " Mar\u00e7o" + mesExtenso;
                break;
            case 4:
                mesExtenso = " Abril" + mesExtenso;
                break;
            case 5:
                mesExtenso = " Maio" + mesExtenso;
                break;
            case 6:
                mesExtenso = " Junho" + mesExtenso;
                break;
            case 7:
                mesExtenso = " Julho" + mesExtenso;
                break;
            case 8:
                mesExtenso = " Agosto" + mesExtenso;
                break;
            case 9:
                mesExtenso = " Setembro" + mesExtenso;
                break;
            case 10:
                mesExtenso = " Outubro" + mesExtenso;
                break;
            case 11:
                mesExtenso = " Novembro" + mesExtenso;
                break;
            case 12:
                mesExtenso = " Dezembro" + mesExtenso;
                break;
        }

        // Verifica milhar
        if (this.ano >= 1900 && this.ano <= 1999)
            anoExtenso = " Mil";
        else if (this.ano >= 2000 && this.ano <= 2999)
            anoExtenso = " Dois" + anoExtenso;
        else if (this.ano >= 3000 && this.ano <= 3999)
            anoExtenso = " Tr\u00eas" + anoExtenso;
        else if (this.ano >= 4000 && this.ano <= 4999)
            anoExtenso = " Quatro" + anoExtenso;
        else if (this.ano >= 5000 && this.ano <= 5999)
            anoExtenso = " Cinco" + anoExtenso;
        else if (this.ano >= 6000 && this.ano <= 6999)
            anoExtenso = " Seis" + anoExtenso;
        else if (this.ano >= 7000 && this.ano <= 7999)
            anoExtenso = " Sete" + anoExtenso;
        else if (this.ano >= 8000 && this.ano <= 8999)
            anoExtenso = " Oito" + anoExtenso;
        else if (this.ano >= 9000 && this.ano <= 9999)
            anoExtenso = " Nove" + anoExtenso;

        // Verifica se não há dezenas e/ou unidades
        if ((this.ano / 10) % 10 == 0 && ((this.ano % 1000) % 100) % 10 == 0)
        {
            // Verifica qual a centena
            if ((this.ano / 100) % 10 == 1)
                anoExtenso += " e Cem";
            else if ((this.ano / 100) % 10 == 2)
                anoExtenso += " e Duzentos";
            else if ((this.ano / 100) % 10 == 3)
                anoExtenso += " e Trezentos";
            else if ((this.ano / 100) % 10 == 4)
                anoExtenso += " e Quatrocentos";
            else if ((this.ano / 100) % 10 == 5)
                anoExtenso += " e Quinhentos";
            else if ((this.ano / 100) % 10 == 6)
                anoExtenso += " e Seiscentos";
            else if ((this.ano / 100) % 10 == 7)
                anoExtenso += " e Setecentos";
            else if ((this.ano / 100) % 10 == 8)
                anoExtenso += " e Oitocentos";
            else if ((this.ano / 100) % 10 == 9)
                anoExtenso += " e Novecentos";
        }
        // Caso haja dezenas, "e" é omitida antes da centena.
        else
        {
            // Verifica qual a centena
            if ((this.ano / 100) % 10 == 1)
                anoExtenso += " Cento";
            else if ((this.ano / 100) % 10 == 2)
                anoExtenso += " Duzentos";
            else if ((this.ano / 100) % 10 == 3)
                anoExtenso += " Trezentos";
            else if ((this.ano / 100) % 10 == 4)
                anoExtenso += " Quatrocentos";
            else if ((this.ano / 100) % 10 == 5)
                anoExtenso += " Quinhentos";
            else if ((this.ano / 100) % 10 == 6)
                anoExtenso += " Seiscentos";
            else if ((this.ano / 100) % 10 == 7)
                anoExtenso += " Setecentos";
            else if ((this.ano / 100) % 10 == 8)
                anoExtenso += " Oitocentos";
            else if ((this.ano / 100) % 10 == 9)
                anoExtenso += " Novecentos";
        }

        // Verifica se há dezena
        if ((this.ano % 100) != 0)
        {
            // Verifica qual é a dezena
            if ((this.ano / 10) % 10 == 1 && ((this.ano % 1000) % 100) % 10 == 0)
                anoExtenso += " e Dez";
            else if ((this.ano / 10) % 10 == 2)
                anoExtenso += " e Vinte";
            else if ((this.ano / 10) % 10 == 3)
                anoExtenso += " e Trinta";
            else if ((this.ano / 10) % 10 == 4)
                anoExtenso += " e Quarenta";
            else if ((this.ano / 10) % 10 == 5)
                anoExtenso += " e Cinquenta";
            else if ((this.ano / 10) % 10 == 6)
                anoExtenso += " e Sessenta";
            else if ((this.ano / 10) % 10 == 7)
                anoExtenso += " e Setenta";
            else if ((this.ano / 10) % 10 == 8)
                anoExtenso += " e Oitenta";
            else if ((this.ano / 10) % 10 == 9)
                anoExtenso += " e Noventa";
        }

        // Verifica se há números entre 11 e 19
        if (((this.ano % 1000) % 100 >= 11 && ((this.ano % 1000) % 100 <= 19)))
        {
            // Verifica qual número está entre 11 e 19
            if ((this.ano / 10) % 10 == 1 && ((this.ano % 1000) % 100) % 10 == 1)
                anoExtenso += " e Onze";
            else if ((this.ano / 10) % 10 == 1 && ((this.ano % 1000) % 100) % 10 == 2)
                anoExtenso += " e Doze";
            else if ((this.ano / 10) % 10 == 1 && ((this.ano % 1000) % 100) % 10 == 3)
                anoExtenso += " e Treze";
            else if ((this.ano / 10) % 10 == 1 && ((this.ano % 1000) % 100) % 10 == 4)
                anoExtenso += " e Quatorze";
            else if ((this.ano / 10) % 10 == 1 && ((this.ano % 1000) % 100) % 10 == 5)
                anoExtenso += " e Quinze";
            else if ((this.ano / 10) % 10 == 1 && ((this.ano % 1000) % 100) % 10 == 6)
                anoExtenso += " e Dezesseis";
            else if ((this.ano / 10) % 10 == 1 && ((this.ano % 1000) % 100) % 10 == 7)
                anoExtenso += " e Dezessete";
            else if ((this.ano / 10) % 10 == 1 && ((this.ano % 1000) % 100) % 10 == 8)
                anoExtenso += " e Dezoito";
            else if ((this.ano / 10) % 10 == 1 && ((this.ano % 1000) % 100) % 10 == 9)
                anoExtenso += " e Dezenove";
        }

        // Verifica se há unidade e se não há dezenas entre 11 e 19
        if (((this.ano % 1000) % 100) % 10 != 0 && !(((this.ano % 1000) % 100 >= 11 && ((this.ano % 1000) % 100 <= 19))))
        {
            // Verifica qual a unidade
            if (((this.ano % 1000) % 100) % 10 == 1)
                anoExtenso += " e Um";
            else if (((this.ano % 1000) % 100) % 10 == 2)
                anoExtenso += " e Dois";
            else if (((this.ano % 1000) % 100) % 10 == 3)
                anoExtenso += " e Tr\u00eas";
            else if (((this.ano % 1000) % 100) % 10 == 4)
                anoExtenso += " e Quatro";
            else if (((this.ano % 1000) % 100) % 10 == 5)
                anoExtenso += " e Cinco";
            else if (((this.ano % 1000) % 100) % 10 == 6)
                anoExtenso += " e Seis";
            else if (((this.ano % 1000) % 100) % 10 == 7)
                anoExtenso += " e Sete";
            else if (((this.ano % 1000) % 100) % 10 == 8)
                anoExtenso += " e Oito";
            else if (((this.ano % 1000) % 100) % 10 == 9)
                anoExtenso += " e Nove";
        }

        return diaExtenso + mesExtenso + anoExtenso;
    }

    public int getDiasCorridos()
    {
        int anosBissextos = 0;
        int diasCorridos = 0;
        int anosComuns = 0;

        // Verifica quantos anos são anos bissextos.
        for (int i = 1900; i < this.ano; i++)
        {
            if (isAnoBissexto(i))
                anosBissextos++;
        }

        anosComuns = (this.ano - anosBissextos) - 1900;
        diasCorridos += (anosComuns * 365) + (anosBissextos * 366);

        for (int i = 1; i < this.mes; i++)
        {
            diasCorridos += getMaxDiaMes(i, this.ano);
        }

        diasCorridos += (this.dia - 1);

        return diasCorridos;
    }

    public int getMaxDiaMes(int mes, int ano)
    {
        if ((mes > 0 && mes <= 12) && (ano >= 1900 && ano <= 9999))
        {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
            {
                return 31;
            }
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            {
                return 30;
            }
            else
            {
                if (isAnoBissexto(ano))
                    return 29;
                else
                    return 28;
            }
        }
        else
            return -1;
    }

    public String toString()
    {
        if (this.dia < 10 && this.mes < 10)
            return "0" + this.dia + "/" + "0" + this.mes + "/" + this.ano;
        else if (this.dia < 10 && this.mes >= 10)
            return "0" + this.dia + "/" + this.mes + "/" + this.ano;
        else if (this.dia >= 10 && this.mes < 10)
            return this.dia + "/" + "0" + this.mes + "/" + this.ano;
        else
            return this.dia + "/" + this.mes + "/" + this.ano;
    }

    public void setData(int dia, int mes, int ano)
    {
        if (isValidDate(dia, mes, ano))
        {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }
    
    public static void main(String[] args)
    {
        Data dt = new Data(12,9,2101);
        System.out.println(dt);
        System.out.println(dt.getDataExtenso());
        System.out.println(dt.getDiaSemana());
        System.out.println(dt.getDiasCorridos());
        System.out.println(dt.getMaxDiaMes(dt.getMes(), dt.getAno()));
        System.out.println(dt.getMaxDiaMes(13, 2000));
    }
}
