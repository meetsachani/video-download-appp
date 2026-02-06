package com.google.firebase.crashlytics;

import java.util.HashMap;
import java.util.Map;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class CustomKeysAndValues {
    public final Map<String, String> a;

    /* loaded from: classes3.dex */
    public static class Builder {
        public Map<String, String> a = new HashMap();

        @InterfaceC5670cr1
        public CustomKeysAndValues b() {
            return new CustomKeysAndValues(this);
        }

        @InterfaceC5670cr1
        public Builder c(@InterfaceC5670cr1 String str, boolean z) {
            this.a.put(str, Boolean.toString(z));
            return this;
        }

        @InterfaceC5670cr1
        public Builder d(@InterfaceC5670cr1 String str, double d) {
            this.a.put(str, Double.toString(d));
            return this;
        }

        @InterfaceC5670cr1
        public Builder e(@InterfaceC5670cr1 String str, float f) {
            this.a.put(str, Float.toString(f));
            return this;
        }

        @InterfaceC5670cr1
        public Builder f(@InterfaceC5670cr1 String str, int i) {
            this.a.put(str, Integer.toString(i));
            return this;
        }

        @InterfaceC5670cr1
        public Builder g(@InterfaceC5670cr1 String str, long j) {
            this.a.put(str, Long.toString(j));
            return this;
        }

        @InterfaceC5670cr1
        public Builder h(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
            this.a.put(str, str2);
            return this;
        }
    }

    public CustomKeysAndValues(@InterfaceC5670cr1 Builder builder) {
        this.a = builder.a;
    }
}
