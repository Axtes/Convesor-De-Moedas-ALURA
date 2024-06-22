public class Moedas {
        private String sigla1;
        private String sigla2;
        private double converter;

        public Moedas(conversor conversor) {
            this.sigla1 = conversor.base_code();
            this.sigla2 = conversor.target_code();
            this.converter = conversor.conversion_rate();
        }

        public Moedas(String sigla1, String sigla2, double converter) {
            this.sigla1 = sigla1;
            this.sigla2 = sigla2;
            this.converter = converter;
        }

        public void setSigla1(String sigla1) {
            this.sigla1 = sigla1;
        }

        public void setSigla2(String sigla2) {
            this.sigla2 = sigla2;
        }

        public void setConverter(double converter) {
            this.converter = converter;
        }

        public String getSigla1() {
            return sigla1;
        }

        public String getSigla2() {
            return sigla2;
        }

        public double getConverter() {
            return converter;
        }

    }
