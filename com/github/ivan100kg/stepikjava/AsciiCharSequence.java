package com.github.ivan100kg.stepikjava;

public class AsciiCharSequence implements CharSequence {
    private byte[] array;

    AsciiCharSequence(byte[] array) {
        this.array = array;
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int index) {
        return (char) array[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] result = new byte[end - start];
        for (int i = 0; i < end - start; i++) {
            result[i] = array[i + start];
        }
        return new AsciiCharSequence(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append((char) this.array[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        AsciiCharSequence sequence = new AsciiCharSequence(new byte[]{12, 98, 127, 0});
        System.out.println(sequence.charAt(0));
        System.out.println(sequence.length());
        System.out.println(sequence);
        System.out.println(sequence.subSequence(1, 2));
    }
}
