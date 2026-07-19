# Changelog

## 1.5.0 (2026-07-19)

Full Changelog: [v1.4.0...v1.5.0](https://github.com/SportsGameOdds/sports-odds-api-java/compare/v1.4.0...v1.5.0)

### Features

* **stlc:** configurable CI runner and private-production-repo support in workflow templates ([20a0ece](https://github.com/SportsGameOdds/sports-odds-api-java/commit/20a0ece4932cda94d9df3d19f4954027e2fc04c3))

## [1.4.0](https://github.com/SportsGameOdds/sports-odds-api-java/compare/v1.3.0...v1.4.0) (2026-07-18)


### Features

* add support for the /markets endpoint ([672cd4c](https://github.com/SportsGameOdds/sports-odds-api-java/commit/672cd4c91890f09d3f138719617064e8933485d7))
* initial stlc build ([5544637](https://github.com/SportsGameOdds/sports-odds-api-java/commit/5544637f0f68cb49389417c125225e49b33608ae))


### Chores

* adopt current stlc generator output ([a17604d](https://github.com/SportsGameOdds/sports-odds-api-java/commit/a17604d2efc855a2200b39d63e1b4ab805398185))

## 1.3.0 (2026-07-08)

Full Changelog: [v1.2.1...v1.3.0](https://github.com/SportsGameOdds/sports-odds-api-java/compare/v1.2.1...v1.3.0)

### Features

* **client:** add `HttpRequest#url()` method ([bcbf5f3](https://github.com/SportsGameOdds/sports-odds-api-java/commit/bcbf5f37dcf8277eaa662e9fe843fdbd20bf0008))
* **client:** allow configuring dispatcher executor service ([8f92672](https://github.com/SportsGameOdds/sports-odds-api-java/commit/8f92672c67695d3ca8ef9414dcd1e6ce7d3ddeec))
* **client:** send `X-Stainless-Kotlin-Version` header ([9efef11](https://github.com/SportsGameOdds/sports-odds-api-java/commit/9efef112c31bace5b6679c893966bb59fd70dbca))


### Bug Fixes

* **client:** disallow coercion from float to int ([65dc38c](https://github.com/SportsGameOdds/sports-odds-api-java/commit/65dc38c687f54b2431c2c95540f007e062ad160c))
* **client:** fully respect max retries ([f002e5a](https://github.com/SportsGameOdds/sports-odds-api-java/commit/f002e5aae4522d9df0f326e0365a0b1c2ba3ad97))
* **client:** preserve time zone in lenient date-time parsing ([b22b74d](https://github.com/SportsGameOdds/sports-odds-api-java/commit/b22b74d38c99eaca0327b305f0307a0c7c34c1af))
* **client:** send retry count header for max retries 0 ([f002e5a](https://github.com/SportsGameOdds/sports-odds-api-java/commit/f002e5aae4522d9df0f326e0365a0b1c2ba3ad97))
* date time deserialization leniency ([59d0c76](https://github.com/SportsGameOdds/sports-odds-api-java/commit/59d0c76242b2fe615de53c183822a92c413d8d28))
* **docs:** fix mcp installation instructions for remote servers ([773c1b7](https://github.com/SportsGameOdds/sports-odds-api-java/commit/773c1b713b3687fbdf58ad3d3a3ec433164275c9))


### Chores

* **ci:** upgrade `actions/github-script` ([5d50569](https://github.com/SportsGameOdds/sports-odds-api-java/commit/5d505695dc91d76c6a3db5db6e7ac50e7a696f71))
* **ci:** upgrade `actions/setup-java` ([34e2e31](https://github.com/SportsGameOdds/sports-odds-api-java/commit/34e2e31ffe75d750635687cc63556c393bc91ce2))
* **internal:** allow passing args to `./scripts/test` ([ccd2dc5](https://github.com/SportsGameOdds/sports-odds-api-java/commit/ccd2dc5ee61eede64ed699331caae74fb38495ca))
* **internal:** clean up maven repo artifact script and add html documentation to repo root ([4088ea8](https://github.com/SportsGameOdds/sports-odds-api-java/commit/4088ea8d97d60d9f42a864b67207bb313d26fba9))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([0dc5927](https://github.com/SportsGameOdds/sports-odds-api-java/commit/0dc5927a002f422a11a7df107f3939428e730a1c))
* **internal:** depend on packages directly in example ([f002e5a](https://github.com/SportsGameOdds/sports-odds-api-java/commit/f002e5aae4522d9df0f326e0365a0b1c2ba3ad97))
* **internal:** improve maven repo docs ([ab02837](https://github.com/SportsGameOdds/sports-odds-api-java/commit/ab028373442d1e13036e16ddefe63a7f7666097b))
* **internal:** support uploading Maven repo artifacts to stainless package server ([bb41dbe](https://github.com/SportsGameOdds/sports-odds-api-java/commit/bb41dbe86b401f7acc5bba05a68c0bee9c197fa3))
* **internal:** update `actions/checkout` version ([6025c58](https://github.com/SportsGameOdds/sports-odds-api-java/commit/6025c58fa7b210c774879d89211cd146b57c08f0))
* **internal:** update maven repo doc to include authentication ([8b9981b](https://github.com/SportsGameOdds/sports-odds-api-java/commit/8b9981b60e716a3ba2e3df27cdc07a8ed6355dcb))
* **internal:** upgrade AssertJ ([3d59141](https://github.com/SportsGameOdds/sports-odds-api-java/commit/3d5914170dbc97472d5fd185914e2a89b4ca4989))
* **internal:** version bump ([154a172](https://github.com/SportsGameOdds/sports-odds-api-java/commit/154a172d1af69d39bc573e8c62842bc6c7531a9d))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/SportsGameOdds/sports-odds-api-java/issues/3240) in tests ([59d0c76](https://github.com/SportsGameOdds/sports-odds-api-java/commit/59d0c76242b2fe615de53c183822a92c413d8d28))


### Documentation

* prominently feature MCP server setup in root SDK readmes ([e10df1f](https://github.com/SportsGameOdds/sports-odds-api-java/commit/e10df1f9ed1a05e18f978ff16b9f2af89a6db0d9))
* remove `$` for better copy-pasteabality ([c7a3a5a](https://github.com/SportsGameOdds/sports-odds-api-java/commit/c7a3a5a422ef86e2af3198779ece77f48a1742d5))

## 1.2.1 (2025-11-27)

Full Changelog: [v1.2.0...v1.2.1](https://github.com/SportsGameOdds/sports-odds-api-java/compare/v1.2.0...v1.2.1)

### Bug Fixes

* **client:** cancel okhttp call when future cancelled ([fba45f8](https://github.com/SportsGameOdds/sports-odds-api-java/commit/fba45f80b783e65578004fc144c7dd8008f0ff56))
* **client:** multi-value header serialization ([da8def3](https://github.com/SportsGameOdds/sports-odds-api-java/commit/da8def333db5ca9b013336209d5df01926b9223c))

## 1.2.0 (2025-10-08)

Full Changelog: [v1.1.0...v1.2.0](https://github.com/SportsGameOdds/sports-odds-api-java/compare/v1.1.0...v1.2.0)

### Features

* test ([94ec92d](https://github.com/SportsGameOdds/sports-odds-api-java/commit/94ec92d6905329111a979c79c106a59e5bac7a45))

## 1.1.0 (2025-10-01)

Full Changelog: [v1.0.0...v1.1.0](https://github.com/SportsGameOdds/sports-odds-api-java/compare/v1.0.0...v1.1.0)

### Features

* **api:** manual updates ([4068482](https://github.com/SportsGameOdds/sports-odds-api-java/commit/40684822f3292a94914e0dd04f38ce2271391e47))

## 1.0.0 (2025-10-01)

Full Changelog: [v0.0.1...v1.0.0](https://github.com/SportsGameOdds/sports-odds-api-java/compare/v0.0.1...v1.0.0)

### Features

* **api:** manual updates ([aa736aa](https://github.com/SportsGameOdds/sports-odds-api-java/commit/aa736aa8fc5a89490a3c03f1b7a0188a94730c64))


### Bug Fixes

* **client:** deserialization of empty objects ([30e72d1](https://github.com/SportsGameOdds/sports-odds-api-java/commit/30e72d168c1c32af681482d52a3bfc7295551f6f))


### Chores

* configure new SDK language ([aa2c683](https://github.com/SportsGameOdds/sports-odds-api-java/commit/aa2c683c465c545c5e8f6088665a4bf04821223c))
* update SDK settings ([b7271cf](https://github.com/SportsGameOdds/sports-odds-api-java/commit/b7271cfb8fe8ea22a5ec9c46fe03b0582e762fa3))
