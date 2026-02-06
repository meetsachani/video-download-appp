package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.InterfaceC10571ws1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class RequestConfiguration {
    public static final int f = -1;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 1;
    public static final int j = 0;
    public static final int k = -1;
    @InterfaceC5670cr1
    public static final String l = "";
    @InterfaceC5670cr1

    /* renamed from: o  reason: collision with root package name */
    public static final String f177o = "T";
    public final int a;
    public final int b;
    @InterfaceC10571ws1
    public final String c;
    public final List d;
    public final PublisherPrivacyPersonalizationState e;
    @InterfaceC5670cr1
    public static final String p = "MA";
    @InterfaceC5670cr1
    public static final String n = "PG";
    @InterfaceC5670cr1
    public static final String m = "G";
    @InterfaceC5670cr1
    public static final List q = Arrays.asList(p, "T", n, m);

    /* loaded from: classes2.dex */
    public static class Builder {
        public int a = -1;
        public int b = -1;
        @InterfaceC10571ws1
        public String c = null;
        public final List d = new ArrayList();
        public PublisherPrivacyPersonalizationState e = PublisherPrivacyPersonalizationState.DEFAULT;

        @InterfaceC5670cr1
        public RequestConfiguration a() {
            return new RequestConfiguration(this.a, this.b, this.c, this.d, this.e, null);
        }

        @InterfaceC5670cr1
        public Builder b(@InterfaceC10571ws1 String str) {
            if (str != null && !"".equals(str)) {
                if (!RequestConfiguration.m.equals(str) && !RequestConfiguration.n.equals(str) && !"T".equals(str) && !RequestConfiguration.p.equals(str)) {
                    zzo.g("Invalid value passed to setMaxAdContentRating: ".concat(str));
                    return this;
                }
                this.c = str;
                return this;
            }
            this.c = null;
            return this;
        }

        @InterfaceC5670cr1
        public Builder c(@InterfaceC5670cr1 PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
            this.e = publisherPrivacyPersonalizationState;
            return this;
        }

        @InterfaceC5670cr1
        public Builder d(int i) {
            if (i != -1 && i != 0 && i != 1) {
                zzo.g("Invalid value passed to setTagForChildDirectedTreatment: " + i);
                return this;
            }
            this.a = i;
            return this;
        }

        @InterfaceC5670cr1
        public Builder e(int i) {
            if (i != -1 && i != 0 && i != 1) {
                zzo.g("Invalid value passed to setTagForUnderAgeOfConsent: " + i);
                return this;
            }
            this.b = i;
            return this;
        }

        @InterfaceC5670cr1
        public Builder f(@InterfaceC10571ws1 List<String> list) {
            List list2 = this.d;
            list2.clear();
            if (list != null) {
                list2.addAll(list);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface MaxAdContentRating {
    }

    /* loaded from: classes2.dex */
    public enum PublisherPrivacyPersonalizationState {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);
        
        public final int X;

        PublisherPrivacyPersonalizationState(int i) {
            this.X = i;
        }

        public int e() {
            return this.X;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface TagForChildDirectedTreatment {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface TagForUnderAgeOfConsent {
    }

    public /* synthetic */ RequestConfiguration(int i2, int i3, String str, List list, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState, zzi zziVar) {
        this.a = i2;
        this.b = i3;
        this.c = str;
        this.d = list;
        this.e = publisherPrivacyPersonalizationState;
    }

    @InterfaceC5670cr1
    public String a() {
        String str = this.c;
        return str == null ? "" : str;
    }

    @InterfaceC5670cr1
    public PublisherPrivacyPersonalizationState b() {
        return this.e;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    @InterfaceC5670cr1
    public List<String> e() {
        return new ArrayList(this.d);
    }

    @InterfaceC5670cr1
    public Builder f() {
        Builder builder = new Builder();
        builder.d(this.a);
        builder.e(this.b);
        builder.b(this.c);
        builder.f(this.d);
        return builder;
    }
}
