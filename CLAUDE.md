# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Overview

KotlinによるGoFデザインパターンの練習リポジトリ（Android Studio プロジェクト）。各パターンはロジックのみで実装され、UIは持たない。

## Commands

```bash
# ユニットテスト全件実行
./gradlew test

# 特定パターンのテストのみ実行
./gradlew testDebugUnitTest --tests "com.example.designpatternpractice.decorator.*"

# ビルド
./gradlew assembleDebug

# Lint
./gradlew lint
```

## Architecture

### パッケージ構造

`app/src/main/java/com/example/designpatternpractice/` 配下に各パターン名のパッケージがある。

```
<pattern>/        # パターン本体の実装
```

対応するテストは `app/src/test/java/com/example/designpatternpractice/<pattern>/` 以下。

### パターンごとの実装方針

- 各パターンは独立したパッケージとして実装し、他パッケージへの依存を持たない
- ビジネスロジックのみ実装し、Android固有のUI層は持たない
- テストは JUnit4 を使用（`testImplementation(libs.junit)`）
- `visitor` と `composite` パターンのように、同じドメイン（組織図など）を異なるパターンで再実装して比較する例がある

### 実装済みパターン一覧

| カテゴリ | パターン | パッケージ |
|---|---|---|
| 生成 | Singleton | `singleton` |
| 生成 | Prototype | `prototype` |
| 生成 | Builder | `builder` |
| 生成 | Factory Method | `factory` |
| 生成 | Abstract Factory | `abstractFactory` |
| 構造 | Adapter（委譲・継承） | `adapter/delegation`, `adapter/inheritance` |
| 構造 | Bridge | `bridge` |
| 構造 | Composite | `composite` |
| 構造 | Decorator | `decorator` |
| 振る舞い | Iterator | `iterator` |
| 振る舞い | Strategy | `strategy` |
| 振る舞い | Template Method | `template` |
| 振る舞い | Visitor | `visitor` |
| 振る舞い | Chain of Responsibility | `chainOfResponsibility` |

### 新しいパターンを追加する際

1. `app/src/main/java/com/example/designpatternpractice/<patternName>/` にパターン本体を実装
2. `app/src/test/java/com/example/designpatternpractice/<patternName>/` にJUnit4テストを追加
3. README.md の実装済みパターン一覧を更新

### コミットメッセージ規約

```
[implement] <パターン名>パターンの実装
[add] <内容>
[fix] <内容>
```