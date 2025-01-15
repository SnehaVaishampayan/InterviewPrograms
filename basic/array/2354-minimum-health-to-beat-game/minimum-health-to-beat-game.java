class Solution {
    public long minimumHealth(int[] damage, int armor) {
        long totalDamage = 1;
        int maxDamage = damage[0];
        for(int i: damage) {
            totalDamage += i;
            maxDamage = Math.max(maxDamage, i);
        }

        maxDamage = (armor > maxDamage ? maxDamage :  armor);

        totalDamage -= maxDamage;

        return totalDamage;
    }
}