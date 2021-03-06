package com.webank.wecross.console.common;

public class HelpInfo {

    public static void promptHelp(String command) {
        System.out.println("Try '" + command + " -h or --help' for more information.");
        System.out.println();
    }

    public static boolean promptNoParams(String[] params, String funcName) {
        if (params.length == 2) {
            if ("-h".equals(params[1]) || "--help".equals(params[1])) {
                helpNoParams(funcName);
                return true;
            } else {
                promptHelp(funcName);
                return true;
            }
        } else if (params.length > 2) {
            promptHelp(funcName);
            return true;
        } else {
            return false;
        }
    }

    public static void helpNoParams(String func) {
        switch (func) {
            case "help":
            case "h":
                help();
                break;
            case "currentServer":
                currentServerHelp();
                break;
            case "listServers":
                listServersHelp();
                break;
            case "listLocalResources":
                listLocalResourcesHelp();
                break;
            case "listResources":
                listResourcesHelp();
                break;
            case "quit":
            case "q":
                quitHelp();
                break;

            default:
                break;
        }
    }

    public static void help() {
        ConsoleUtils.singleLine();
        System.out.println("Provide help information.");
        System.out.println("Usage: help");
        ConsoleUtils.singleLine();
    }

    public static void currentServerHelp() {
        ConsoleUtils.singleLine();
        System.out.println("Show currently connected WeCross server..");
        System.out.println("Usage: currentServer");
        ConsoleUtils.singleLine();
    }

    public static void listServersHelp() {
        ConsoleUtils.singleLine();
        System.out.println("List all configured WeCross servers.");
        System.out.println("Usage: listServers");
        ConsoleUtils.singleLine();
    }

    public static void switchHelp() {
        ConsoleUtils.singleLine();
        System.out.println("Switch to a specific WeCross server.");
        System.out.println("Usage: switch [server]");
        System.out.println("server -- The key of a server in your configuration.");
        ConsoleUtils.singleLine();
    }

    public static void listHelp() {
        ConsoleUtils.singleLine();
        System.out.println("List all resources configured by WeCross server.");
        System.out.println("Usage: list [option]");
        System.out.println("option -- 1: ignore remote source.");
        System.out.println("option -- 0: not ignore remote source.");
        ConsoleUtils.singleLine();
    }

    public static void listLocalResourcesHelp() {
        ConsoleUtils.singleLine();
        System.out.println("List local resources configured by WeCross server.");
        System.out.println("Usage: listLocalResources ");
        ConsoleUtils.singleLine();
    }

    public static void listResourcesHelp() {
        ConsoleUtils.singleLine();
        System.out.println("List all resources including remote resources.");
        System.out.println("Usage: listAllResources ");
        ConsoleUtils.singleLine();
    }

    public static void statusHelp() {
        ConsoleUtils.singleLine();
        System.out.println("Check if the resource exists.");
        System.out.println("Usage: status [path]");
        System.out.println("path: the path of resource in wecross server.");
        ConsoleUtils.singleLine();
    }

    public static void getDataHelp() {
        ConsoleUtils.singleLine();
        System.out.println("Get data from contract.");
        System.out.println("Usage:  getData [path] [key]");
        System.out.println("path:   the path of the contract resource in wecross server.");
        System.out.println("key:    the key of an entry");
        ConsoleUtils.singleLine();
    }

    public static void setDataHelp() {
        ConsoleUtils.singleLine();
        System.out.println("Set data for contract.");
        System.out.println("Usage:  setData [path] [key] [value]");
        System.out.println("path:   the path of the contract resource in wecross server.");
        System.out.println("key:    the key of an entry");
        System.out.println("value:  the value of an entry");
        ConsoleUtils.singleLine();
    }

    public static void callHelp() {
        ConsoleUtils.singleLine();
        System.out.println("Call constant method of smart contract.");
        System.out.println("Usage:  call [path] [method] [...args]");
        System.out.println("path:   the path of the contract resource in wecross server.");
        System.out.println(
                "types:  the types of return values, support: Void, Int, IntArray, String, StringArray.");
        System.out.println("method: the method in contract.");
        System.out.println("args:   variable parameter list.");
        ConsoleUtils.singleLine();
    }

    public static void callIntHelp() {
        ConsoleUtils.singleLine();
        System.out.println("Call constant method of smart contract with int returned.");
        System.out.println("Usage:  call [path] [method] [...args]");
        System.out.println("path:   the path of the contract resource in wecross server.");
        System.out.println("method: the method in contract.");
        System.out.println("args:   variable parameter list.");
        ConsoleUtils.singleLine();
    }

    public static void callIntArrayHelp() {
        ConsoleUtils.singleLine();
        System.out.println("Call constant method of smart contract with int array returned.");
        System.out.println("Usage:  call [path] [method] [...args]");
        System.out.println("path:   the path of the contract resource in wecross server.");
        System.out.println("method: the method in contract.");
        System.out.println("args:   variable parameter list.");
        ConsoleUtils.singleLine();
    }

    public static void callStringHelp() {
        ConsoleUtils.singleLine();
        System.out.println("Call constant method of smart contract with string returned.");
        System.out.println("Usage:  call [path] [method] [...args]");
        System.out.println("path:   the path of the contract resource in wecross server.");
        System.out.println("method: the method in contract.");
        System.out.println("args:   variable parameter list.");
        ConsoleUtils.singleLine();
    }

    public static void callStringArrayHelp() {
        ConsoleUtils.singleLine();
        System.out.println("Call constant method of smart contract with string array returned.");
        System.out.println("Usage:  call [path] [method] [...args]");
        System.out.println("path:   the path of the contract resource in wecross server.");
        System.out.println("method: the method in contract.");
        System.out.println("args:   variable parameter list.");
        ConsoleUtils.singleLine();
    }

    public static void sendTransactionHelp() {
        ConsoleUtils.singleLine();
        System.out.println("Call non-constant method of smart contract.");
        System.out.println("Usage:  sendTransaction [path] [method] [...args]");
        System.out.println("path:   the path of the contract resource in wecross server.");
        System.out.println(
                "types:  the types of return values, support: Void, Int, IntArray, String, StringArray.");
        System.out.println("method: the method in contract.");
        System.out.println("args:   variable parameter list.");
        ConsoleUtils.singleLine();
    }

    public static void sendTransactionIntHelp() {
        ConsoleUtils.singleLine();
        System.out.println("Call non-constant method of smart contract with int returned.");
        System.out.println("Usage:  sendTransaction [path] [method] [...args]");
        System.out.println("path:   the path of the contract resource in wecross server.");
        System.out.println("method: the method in contract.");
        System.out.println("args:   variable parameter list.");
        ConsoleUtils.singleLine();
    }

    public static void sendTransactionIntArrayHelp() {
        ConsoleUtils.singleLine();
        System.out.println("Call non-constant method of smart contract with int array returned.");
        System.out.println("Usage:  sendTransaction [path] [method] [...args]");
        System.out.println("path:   the path of the contract resource in wecross server.");
        System.out.println("method: the method in contract.");
        System.out.println("args:   variable parameter list.");
        ConsoleUtils.singleLine();
    }

    public static void sendTransactionStringHelp() {
        ConsoleUtils.singleLine();
        System.out.println("Call non-constant method of smart contract with string returned.");
        System.out.println("Usage:  sendTransaction [path] [method] [...args]");
        System.out.println("path:   the path of the contract resource in wecross server.");
        System.out.println("method: the method in contract.");
        System.out.println("args:   variable parameter list.");
        ConsoleUtils.singleLine();
    }

    public static void sendTransactionStringArrayHelp() {
        ConsoleUtils.singleLine();
        System.out.println(
                "Call non-constant method of smart contract with string array returned.");
        System.out.println("Usage:  sendTransaction [path] [method] [...args]");
        System.out.println("path:   the path of the contract resource in wecross server.");
        System.out.println("method: the method in contract.");
        System.out.println("args:   variable parameter list.");
        ConsoleUtils.singleLine();
    }

    public static void quitHelp() {
        ConsoleUtils.singleLine();
        System.out.println("Quit console.");
        System.out.println("Usage: quit or exit");
        ConsoleUtils.singleLine();
    }
}
