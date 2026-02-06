package com.facebook.internal;

import androidx.profileinstaller.d;
import com.facebook.internal.C2378x;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import o.C6562gT0;
import o.C9516sY;
import o.C9545sf2;
import o.HT1;
import o.InterfaceC9511sW0;
import o.InterfaceMenuC9553sh2;
import o.XE2;
import org.jetbrains.annotations.NotNull;

@HT1({HT1.a.Y})
/* renamed from: com.facebook.internal.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2375u {
    @NotNull
    public static final String b = "com.facebook.internal.FEATURE_MANAGER";
    @NotNull
    public static final C2375u a = new C2375u();
    @NotNull
    public static final Map<b, String[]> c = new HashMap();

    /* renamed from: com.facebook.internal.u$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z);
    }

    /* renamed from: com.facebook.internal.u$b */
    /* loaded from: classes2.dex */
    public enum b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        ProtectedMode(66564),
        MACARuleMatching(66565),
        BlocklistEvents(66566),
        FilterRedactedEvents(66567),
        FilterSensitiveParams(66568),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(d.c.m),
        ServiceUpdateCompliance(196864),
        Megatron(262144),
        Elora(d.c.f50o),
        Login(16777216),
        ChromeCustomTabsPrefetching(16842752),
        IgnoreAppSwitchToLoggedOut(16908288),
        BypassAppSwitch(16973824),
        Share(33554432);
        
        @NotNull
        public static final a Y = new a(null);
        public final int X;

        /* renamed from: com.facebook.internal.u$b$a */
        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            @NotNull
            public final b a(int i) {
                b[] valuesCustom = b.valuesCustom();
                int length = valuesCustom.length;
                int i2 = 0;
                while (i2 < length) {
                    b bVar = valuesCustom[i2];
                    i2++;
                    if (bVar.X == i) {
                        return bVar;
                    }
                }
                return b.Unknown;
            }

            public a() {
            }
        }

        /* renamed from: com.facebook.internal.u$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0085b {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[b.valuesCustom().length];
                iArr[b.Core.ordinal()] = 1;
                iArr[b.AppEvents.ordinal()] = 2;
                iArr[b.CodelessEvents.ordinal()] = 3;
                iArr[b.RestrictiveDataFiltering.ordinal()] = 4;
                iArr[b.Instrument.ordinal()] = 5;
                iArr[b.CrashReport.ordinal()] = 6;
                iArr[b.CrashShield.ordinal()] = 7;
                iArr[b.ThreadCheck.ordinal()] = 8;
                iArr[b.ErrorReport.ordinal()] = 9;
                iArr[b.AnrReport.ordinal()] = 10;
                iArr[b.AAM.ordinal()] = 11;
                iArr[b.CloudBridge.ordinal()] = 12;
                iArr[b.PrivacyProtection.ordinal()] = 13;
                iArr[b.SuggestedEvents.ordinal()] = 14;
                iArr[b.IntelligentIntegrity.ordinal()] = 15;
                iArr[b.ProtectedMode.ordinal()] = 16;
                iArr[b.MACARuleMatching.ordinal()] = 17;
                iArr[b.BlocklistEvents.ordinal()] = 18;
                iArr[b.FilterRedactedEvents.ordinal()] = 19;
                iArr[b.FilterSensitiveParams.ordinal()] = 20;
                iArr[b.ModelRequest.ordinal()] = 21;
                iArr[b.EventDeactivation.ordinal()] = 22;
                iArr[b.OnDeviceEventProcessing.ordinal()] = 23;
                iArr[b.OnDevicePostInstallEventProcessing.ordinal()] = 24;
                iArr[b.IapLogging.ordinal()] = 25;
                iArr[b.IapLoggingLib2.ordinal()] = 26;
                iArr[b.Monitoring.ordinal()] = 27;
                iArr[b.Megatron.ordinal()] = 28;
                iArr[b.Elora.ordinal()] = 29;
                iArr[b.ServiceUpdateCompliance.ordinal()] = 30;
                iArr[b.Login.ordinal()] = 31;
                iArr[b.ChromeCustomTabsPrefetching.ordinal()] = 32;
                iArr[b.IgnoreAppSwitchToLoggedOut.ordinal()] = 33;
                iArr[b.BypassAppSwitch.ordinal()] = 34;
                iArr[b.Share.ordinal()] = 35;
                a = iArr;
            }
        }

        b(int i) {
            this.X = i;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        @NotNull
        public final b h() {
            int i = this.X;
            if ((i & 255) > 0) {
                return Y.a(i & (-256));
            }
            if ((65280 & i) > 0) {
                return Y.a(i & InterfaceMenuC9553sh2.c);
            }
            if ((16711680 & i) > 0) {
                return Y.a(i & (-16777216));
            }
            return Y.a(0);
        }

        @NotNull
        public final String i() {
            return C6562gT0.C("FBSDKFeature", this);
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            switch (C0085b.a[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "AppEventsCloudbridge";
                case 13:
                    return "PrivacyProtection";
                case 14:
                    return "SuggestedEvents";
                case 15:
                    return "IntelligentIntegrity";
                case 16:
                    return "ProtectedMode";
                case 17:
                    return "MACARuleMatching";
                case 18:
                    return "BlocklistEvents";
                case 19:
                    return "FilterRedactedEvents";
                case 20:
                    return "FilterSensitiveParams";
                case 21:
                    return "ModelRequest";
                case 22:
                    return "EventDeactivation";
                case 23:
                    return "OnDeviceEventProcessing";
                case 24:
                    return "OnDevicePostInstallEventProcessing";
                case 25:
                    return "IAPLogging";
                case 26:
                    return "IAPLoggingLib2";
                case 27:
                    return "Monitoring";
                case 28:
                    return "Megatron";
                case 29:
                    return "Elora";
                case 30:
                    return "ServiceUpdateCompliance";
                case 31:
                    return "LoginKit";
                case 32:
                    return "ChromeCustomTabsPrefetching";
                case 33:
                    return "IgnoreAppSwitchToLoggedOut";
                case 34:
                    return "BypassAppSwitch";
                case 35:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }
    }

    /* renamed from: com.facebook.internal.u$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.valuesCustom().length];
            iArr[b.RestrictiveDataFiltering.ordinal()] = 1;
            iArr[b.Instrument.ordinal()] = 2;
            iArr[b.CrashReport.ordinal()] = 3;
            iArr[b.CrashShield.ordinal()] = 4;
            iArr[b.ThreadCheck.ordinal()] = 5;
            iArr[b.ErrorReport.ordinal()] = 6;
            iArr[b.AnrReport.ordinal()] = 7;
            iArr[b.AAM.ordinal()] = 8;
            iArr[b.CloudBridge.ordinal()] = 9;
            iArr[b.PrivacyProtection.ordinal()] = 10;
            iArr[b.SuggestedEvents.ordinal()] = 11;
            iArr[b.IntelligentIntegrity.ordinal()] = 12;
            iArr[b.ModelRequest.ordinal()] = 13;
            iArr[b.EventDeactivation.ordinal()] = 14;
            iArr[b.OnDeviceEventProcessing.ordinal()] = 15;
            iArr[b.OnDevicePostInstallEventProcessing.ordinal()] = 16;
            iArr[b.IapLogging.ordinal()] = 17;
            iArr[b.IapLoggingLib2.ordinal()] = 18;
            iArr[b.ProtectedMode.ordinal()] = 19;
            iArr[b.MACARuleMatching.ordinal()] = 20;
            iArr[b.BlocklistEvents.ordinal()] = 21;
            iArr[b.FilterRedactedEvents.ordinal()] = 22;
            iArr[b.FilterSensitiveParams.ordinal()] = 23;
            iArr[b.ChromeCustomTabsPrefetching.ordinal()] = 24;
            iArr[b.Monitoring.ordinal()] = 25;
            iArr[b.IgnoreAppSwitchToLoggedOut.ordinal()] = 26;
            iArr[b.BypassAppSwitch.ordinal()] = 27;
            a = iArr;
        }
    }

    /* renamed from: com.facebook.internal.u$d */
    /* loaded from: classes2.dex */
    public static final class d implements C2378x.a {
        public final /* synthetic */ a a;
        public final /* synthetic */ b b;

        public d(a aVar, b bVar) {
            this.a = aVar;
            this.b = bVar;
        }

        @Override // com.facebook.internal.C2378x.a
        public void a() {
            a aVar = this.a;
            C2375u c2375u = C2375u.a;
            aVar.a(C2375u.g(this.b));
        }
    }

    @InterfaceC9511sW0
    public static final void a(@NotNull b bVar, @NotNull a aVar) {
        C6562gT0.p(bVar, XE2.g);
        C6562gT0.p(aVar, "callback");
        C2378x c2378x = C2378x.a;
        C2378x.h(new d(aVar, bVar));
    }

    @InterfaceC9511sW0
    public static final void c(@NotNull b bVar) {
        C6562gT0.p(bVar, XE2.g);
        com.facebook.M m = com.facebook.M.a;
        com.facebook.M.n().getSharedPreferences(b, 0).edit().putString(bVar.i(), com.facebook.M.I()).apply();
    }

    @InterfaceC9511sW0
    @NotNull
    public static final b d(@NotNull String str) {
        C6562gT0.p(str, "className");
        a.f();
        for (Map.Entry<b, String[]> entry : c.entrySet()) {
            b key = entry.getKey();
            String[] value = entry.getValue();
            int length = value.length;
            int i = 0;
            while (i < length) {
                String str2 = value[i];
                i++;
                if (C9545sf2.J2(str, str2, false, 2, null)) {
                    return key;
                }
            }
        }
        return b.Unknown;
    }

    @InterfaceC9511sW0
    public static final boolean g(@NotNull b bVar) {
        C6562gT0.p(bVar, XE2.g);
        if (b.Unknown == bVar) {
            return false;
        }
        if (b.Core == bVar) {
            return true;
        }
        com.facebook.M m = com.facebook.M.a;
        String string = com.facebook.M.n().getSharedPreferences(b, 0).getString(bVar.i(), null);
        if (string != null && C6562gT0.g(string, com.facebook.M.I())) {
            return false;
        }
        b h = bVar.h();
        if (h == bVar) {
            return a.e(bVar);
        }
        if (!g(h) || !a.e(bVar)) {
            return false;
        }
        return true;
    }

    public final boolean b(b bVar) {
        switch (c.a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                return false;
            default:
                return true;
        }
    }

    public final boolean e(b bVar) {
        boolean b2 = b(bVar);
        C2378x c2378x = C2378x.a;
        String i = bVar.i();
        com.facebook.M m = com.facebook.M.a;
        return C2378x.d(i, com.facebook.M.o(), b2);
    }

    public final synchronized void f() {
        Map<b, String[]> map = c;
        if (!map.isEmpty()) {
            return;
        }
        map.put(b.AAM, new String[]{"com.facebook.appevents.aam."});
        map.put(b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
        map.put(b.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
        map.put(b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
        map.put(b.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
        map.put(b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
        map.put(b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
        map.put(b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
        map.put(b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
        map.put(b.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
        map.put(b.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
        map.put(b.BlocklistEvents, new String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
        map.put(b.FilterRedactedEvents, new String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
        map.put(b.FilterSensitiveParams, new String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
        map.put(b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
        map.put(b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
        map.put(b.IapLogging, new String[]{"com.facebook.appevents.iap."});
        map.put(b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
    }
}
