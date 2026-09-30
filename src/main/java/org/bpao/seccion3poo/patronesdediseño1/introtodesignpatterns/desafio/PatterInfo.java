package org.bpao.seccion3poo.patronesdediseño1.introtodesignpatterns.desafio;

public class PatterInfo {
    // TODO: Crea tres clases que implementen la interfaz Pattern

    // Clase CreationalPattern
    // - getCategory() debe devolver "Creational"
    // - getPurpose() should return "How objects are created"
    static class CreationalPattern implements Pattern {
        // TODO: Implementa getCategory()
        @Override
        public String getCategory() {
            return "Creational";
        }

        // TODO: Implementa getPurpose()
        @Override
        public String getPurpose() {
            return "How objects are created";
        }
    }

    // Clase StructuralPattern
    // - getCategory() debe devolver "Structural"
    // - getPurpose() should return "How objects are composed"
    static class StructuralPattern implements Pattern {
        // TODO: Implementa getCategory()
        @Override
        public String getCategory() {
            return "Structural";
        }

        // TODO: Implementa getPurpose()
        @Override
        public String getPurpose() {
            return "How objects are composed";
        }
    }

    // Clase BehavioralPattern
    // - getCategory() debe devolver "Behavioral"
    // - getPurpose() should return "How objects communicate"
    static class BehavioralPattern implements Pattern {
        // TODO: Implementa getCategory()
        @Override
        public String getCategory() {
            return "Behavioral";
        }

        // TODO: Implementa getPurpose()
        @Override
        public String getPurpose() {
            return "How objects communicate";
        }
    }
}
