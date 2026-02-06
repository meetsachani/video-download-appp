package com.google.firebase.remoteconfig;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public final class RemoteConfigConstants {
    public static final String a = "https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch";
    public static final String b = "https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ExperimentDescriptionFieldKey {
        public static final String S = "experimentId";
        public static final String T = "variantId";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface RequestFieldKey {
        public static final String U = "appInstanceId";
        public static final String V = "appInstanceIdToken";
        public static final String W = "appId";
        public static final String X = "countryCode";
        public static final String Y = "languageCode";
        public static final String Z = "platformVersion";
        public static final String a0 = "timeZone";
        public static final String b0 = "appVersion";
        public static final String c0 = "appBuild";
        public static final String d0 = "packageName";
        public static final String e0 = "sdkVersion";
        public static final String f0 = "analyticsUserProperties";
        public static final String g0 = "firstOpenTime";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ResponseFieldKey {
        public static final String h0 = "entries";
        public static final String i0 = "experimentDescriptions";
        public static final String j0 = "personalizationMetadata";
        public static final String k0 = "state";
        public static final String l0 = "templateVersion";
        public static final String m0 = "rolloutMetadata";
    }

    private RemoteConfigConstants() {
    }
}
