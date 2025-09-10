package com.system.Blog.repository;

public class PosteoRepository {
    @Repository
    public static class PosteoRepository implements IposteoRepository {

        private List<Posteo> posteo = new ArrayList<>();

        public PersonaRepository() {
            posteo.add(new Posteo(1L, "Aventuras en Papitas", "Generation"));
            posteo.add(new Posteo(2L, "¿Cómo colarse en TransMilenio?", "Alcaldía Mayor de Bogotá"));
        }

        @Override
        public List<Posteo> findAll() {
            return posteo;
        }

        @Override
        public Posteo findById(Long id) {
            for (Posteo persona : posteo) {
                if (persona.getId_posteo().equals(id)) {
                    return posteo;
                }
            }
            return null;
        }

        @Override
        public void save(Posteo posteo) {
            posteo.add(posteo);
        }
    }
}
