package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import com.facebook.S;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.nio.charset.Charset;
import o.C11298zs;
import o.C3123Hc0;
import o.InterfaceC3385Js2;
import o.InterfaceC5670cr1;
import o.Ot2;
import o.Ut2;

/* loaded from: classes3.dex */
public class DataTransportCrashlyticsReportSender {
    public static final String f = "FIREBASE_CRASHLYTICS_REPORT";
    public final ReportQueue a;
    public final InterfaceC3385Js2<CrashlyticsReport, byte[]> b;
    public static final CrashlyticsReportJsonTransform c = new CrashlyticsReportJsonTransform();
    public static final String d = d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String e = d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final InterfaceC3385Js2<CrashlyticsReport, byte[]> g = new InterfaceC3385Js2() { // from class: o.UU
        @Override // o.InterfaceC3385Js2
        public final Object apply(Object obj) {
            byte[] bytes;
            bytes = DataTransportCrashlyticsReportSender.c.O((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
            return bytes;
        }
    };

    public DataTransportCrashlyticsReportSender(ReportQueue reportQueue, InterfaceC3385Js2<CrashlyticsReport, byte[]> interfaceC3385Js2) {
        this.a = reportQueue;
        this.b = interfaceC3385Js2;
    }

    public static DataTransportCrashlyticsReportSender b(Context context, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter) {
        Ut2.f(context);
        Ot2 h = Ut2.c().h(new C11298zs(d, e));
        C3123Hc0 b = C3123Hc0.b(S.B);
        InterfaceC3385Js2<CrashlyticsReport, byte[]> interfaceC3385Js2 = g;
        return new DataTransportCrashlyticsReportSender(new ReportQueue(h.b(f, CrashlyticsReport.class, b, interfaceC3385Js2), settingsProvider.b(), onDemandCounter), interfaceC3385Js2);
    }

    public static String d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str.length() + str2.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                if (str2.length() > i) {
                    sb.append(str2.charAt(i));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    @InterfaceC5670cr1
    public Task<CrashlyticsReportWithSessionId> c(@InterfaceC5670cr1 CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        return this.a.i(crashlyticsReportWithSessionId, z).a();
    }
}
