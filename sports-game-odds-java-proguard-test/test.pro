# Specify the entrypoint where ProGuard starts to determine what's reachable.
-keep class com.sports_odds_api.api.proguard.** { *; }

# For the testing framework.
-keep class org.junit.** { *; }

# Many warnings don't apply for our testing purposes.
-dontnote
-dontwarn