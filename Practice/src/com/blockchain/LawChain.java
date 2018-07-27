package com.blockchain;

import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class LawChain {

    public static ArrayList<Block> blockChain = new ArrayList<Block>();
    public static int difficulty = 5;

    public static void main(String[] args) {
        blockChain.add(new Block("Hi im the first block", "0"));
        System.out.println("Trying to Mine block 1...");
        blockChain.get(0).mineBlock(difficulty);

        blockChain.add(new Block("Yo im the second block", blockChain.get(blockChain.size() - 1).hash));
        System.out.println("Trying to Mine block 2...");
        blockChain.get(1).mineBlock(difficulty);

        blockChain.add(new Block("Hey im the third block", blockChain.get(blockChain.size() - 1).hash));
        System.out.println("Trying to mine block 3...");
        blockChain.get(2).mineBlock(difficulty);

        System.out.println("\nBlockchain is valid " + isChainValid());

        String blockChainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockChain);
        System.out.println("\nThe block chain: ");
        System.out.println(blockChainJson);

    }

    public static Boolean isChainValid() {
        Block currentBlock;
        Block previousBlock;

        for (int i = 1; i < blockChain.size(); i++) {
            currentBlock = blockChain.get(i);
            previousBlock = blockChain.get(i - 1);

            if (!currentBlock.hash.equals(currentBlock.calculateHash())) {
                System.out.println("Current hashes not equal");
                return false;
            }

            if (!previousBlock.hash.equals(currentBlock.previousHash)) {
                System.out.println("Previous Hashes not equal");
                return false;
            }
        }

        return true;
    }
}
