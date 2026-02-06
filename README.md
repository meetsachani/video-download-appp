# video-download-appp

This repository contains decompiled Android sources under `video/video/`.

## Build setup

A minimal Gradle Android project has been added that points source sets at the decompiled paths:

- Manifest: `video/video/resources/AndroidManifest.xml`
- Sources: `video/video/sources/`
- Resources: `video/video/resources/res/`
- Assets: `video/video/resources/assets/`

### Build steps

1. Install Android Studio / Android SDK (API 34).
2. From the repo root, run:

```bash
./gradlew :app:assembleDebug
```

If you do not have the Gradle wrapper, run the build from Android Studio (it will download the proper Gradle distribution), or install Gradle and run `gradle :app:assembleDebug`.

## Notes

- This is a decompiled project; some rebuild issues may still remain and require dependency tuning.
- The app’s AndroidX and third‑party library classes are included as source in `video/video/sources/`, so dependencies are intentionally minimal.
