package com.example;

public abstract class AbstractProcess {

    // 前処理
    protected abstract void before();

    // メイン処理
    protected abstract void process();

    // 後処理
    protected abstract void after();

    // テンプレートメソッド
    public final void execute() {
        before();
        process();
        after();
    }
}
