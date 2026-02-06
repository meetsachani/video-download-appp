package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.SettingsJsonConstants;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.BU0;
import o.C3209Hz;
import o.C3771Nr1;
import o.InterfaceC5670cr1;
import o.InterfaceC8148mw2;
import o.SQ0;

/* loaded from: classes3.dex */
public class CrashlyticsReportJsonTransform {
    public static final DataEncoder a = new JsonDataEncoderBuilder().k(AutoCrashlyticsReportEncoder.b).l(true).j();

    /* loaded from: classes3.dex */
    public interface ObjectParser<T> {
        T a(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException;
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session.Event.Log A(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Log.Builder a2 = CrashlyticsReport.Session.Event.Log.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                a2.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session.Event.RolloutAssignment B(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.RolloutAssignment.Builder a2 = CrashlyticsReport.Session.Event.RolloutAssignment.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1536268810:
                    if (nextName.equals(RolloutAssignment.c)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1027290370:
                    if (nextName.equals("templateVersion")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1098747284:
                    if (nextName.equals("rolloutVariant")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1124454216:
                    if (nextName.equals(RolloutAssignment.d)) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.b(jsonReader.nextString());
                    break;
                case 1:
                    a2.e(jsonReader.nextLong());
                    break;
                case 2:
                    a2.d(K(jsonReader));
                    break;
                case 3:
                    a2.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session.Event.RolloutsState C(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.RolloutsState.Builder a2 = CrashlyticsReport.Session.Event.RolloutsState.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("assignments")) {
                jsonReader.skipValue();
            } else {
                a2.b(p(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.i
                    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                    public final Object a(JsonReader jsonReader2) {
                        CrashlyticsReport.Session.Event.RolloutAssignment B;
                        B = CrashlyticsReportJsonTransform.B(jsonReader2);
                        return B;
                    }
                }));
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session.Event.Application.Execution.Signal D(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder a2 = CrashlyticsReport.Session.Event.Application.Execution.Signal.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.b(jsonReader.nextLong());
                    break;
                case 1:
                    a2.c(jsonReader.nextString());
                    break;
                case 2:
                    a2.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session.Event.Application.Execution.Thread E(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder a2 = CrashlyticsReport.Session.Event.Application.Execution.Thread.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.b(p(jsonReader, new a()));
                    break;
                case 1:
                    a2.d(jsonReader.nextString());
                    break;
                case 2:
                    a2.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.FilesPayload.File F(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.FilesPayload.File.Builder a2 = CrashlyticsReport.FilesPayload.File.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("filename")) {
                if (!nextName.equals("contents")) {
                    jsonReader.skipValue();
                } else {
                    a2.b(Base64.decode(jsonReader.nextString(), 2));
                }
            } else {
                a2.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.FilesPayload G(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.FilesPayload.Builder a2 = CrashlyticsReport.FilesPayload.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("files")) {
                if (!nextName.equals("orgId")) {
                    jsonReader.skipValue();
                } else {
                    a2.c(jsonReader.nextString());
                }
            } else {
                a2.b(p(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.h
                    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                    public final Object a(JsonReader jsonReader2) {
                        CrashlyticsReport.FilesPayload.File F;
                        F = CrashlyticsReportJsonTransform.F(jsonReader2);
                        return F;
                    }
                }));
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session.OperatingSystem H(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.OperatingSystem.Builder a2 = CrashlyticsReport.Session.OperatingSystem.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.b(jsonReader.nextString());
                    break;
                case 1:
                    a2.c(jsonReader.nextBoolean());
                    break;
                case 2:
                    a2.e(jsonReader.nextString());
                    break;
                case 3:
                    a2.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session.Event.Application.ProcessDetails I(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder a2 = CrashlyticsReport.Session.Event.Application.ProcessDetails.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 0;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1694598382:
                    if (nextName.equals("defaultProcess")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.d(jsonReader.nextInt());
                    break;
                case 1:
                    a2.e(jsonReader.nextString());
                    break;
                case 2:
                    a2.b(jsonReader.nextBoolean());
                    break;
                case 3:
                    a2.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport J(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Builder b = CrashlyticsReport.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals(RemoteConfigConstants.RequestFieldKey.e0)) {
                        c = 1;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 3;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 4;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 5;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals(SettingsJsonConstants.b)) {
                        c = '\n';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    b.i(G(jsonReader));
                    break;
                case 1:
                    b.k(jsonReader.nextString());
                    break;
                case 2:
                    b.c(jsonReader.nextString());
                    break;
                case 3:
                    b.b(o(jsonReader));
                    break;
                case 4:
                    b.d(jsonReader.nextString());
                    break;
                case 5:
                    b.g(jsonReader.nextString());
                    break;
                case 6:
                    b.h(jsonReader.nextString());
                    break;
                case 7:
                    b.f(jsonReader.nextString());
                    break;
                case '\b':
                    b.j(jsonReader.nextInt());
                    break;
                case '\t':
                    b.e(jsonReader.nextString());
                    break;
                case '\n':
                    b.l(L(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant K(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder a2 = CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("variantId")) {
                if (!nextName.equals("rolloutId")) {
                    jsonReader.skipValue();
                } else {
                    a2.b(jsonReader.nextString());
                }
            } else {
                a2.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session L(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Builder a2 = CrashlyticsReport.Session.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals(BU0.f)) {
                        c = 6;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(FirebaseMessaging.r)) {
                        c = 7;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c = 11;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.m(jsonReader.nextLong());
                    break;
                case 1:
                    a2.c(jsonReader.nextString());
                    break;
                case 2:
                    a2.k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a2.f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 4:
                    a2.e(s(jsonReader));
                    break;
                case 5:
                    a2.g(p(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.e
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object a(JsonReader jsonReader2) {
                            CrashlyticsReport.Session.Event t;
                            t = CrashlyticsReportJsonTransform.t(jsonReader2);
                            return t;
                        }
                    }));
                    break;
                case 6:
                    a2.l(H(jsonReader));
                    break;
                case 7:
                    a2.b(n(jsonReader));
                    break;
                case '\b':
                    a2.n(M(jsonReader));
                    break;
                case '\t':
                    a2.h(jsonReader.nextString());
                    break;
                case '\n':
                    a2.d(jsonReader.nextBoolean());
                    break;
                case 11:
                    a2.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session.User M(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.User.Builder a2 = CrashlyticsReport.Session.User.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                a2.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session.Application n(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Application.Builder a2 = CrashlyticsReport.Session.Application.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.e(jsonReader.nextString());
                    break;
                case 1:
                    a2.b(jsonReader.nextString());
                    break;
                case 2:
                    a2.c(jsonReader.nextString());
                    break;
                case 3:
                    a2.h(jsonReader.nextString());
                    break;
                case 4:
                    a2.f(jsonReader.nextString());
                    break;
                case 5:
                    a2.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.ApplicationExitInfo o(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.ApplicationExitInfo.Builder a2 = CrashlyticsReport.ApplicationExitInfo.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.b(p(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.b
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object a(JsonReader jsonReader2) {
                            CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch q;
                            q = CrashlyticsReportJsonTransform.q(jsonReader2);
                            return q;
                        }
                    }));
                    break;
                case 1:
                    a2.d(jsonReader.nextInt());
                    break;
                case 2:
                    a2.f(jsonReader.nextLong());
                    break;
                case 3:
                    a2.h(jsonReader.nextLong());
                    break;
                case 4:
                    a2.i(jsonReader.nextLong());
                    break;
                case 5:
                    a2.e(jsonReader.nextString());
                    break;
                case 6:
                    a2.g(jsonReader.nextInt());
                    break;
                case 7:
                    a2.j(jsonReader.nextString());
                    break;
                case '\b':
                    a2.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static <T> List<T> p(@InterfaceC5670cr1 JsonReader jsonReader, @InterfaceC5670cr1 ObjectParser<T> objectParser) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(objectParser.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch q(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder a2 = CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -609862170:
                    if (nextName.equals("libraryName")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 1;
                        break;
                    }
                    break;
                case 230943785:
                    if (nextName.equals("buildId")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.d(jsonReader.nextString());
                    break;
                case 1:
                    a2.b(jsonReader.nextString());
                    break;
                case 2:
                    a2.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.CustomAttribute r(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.CustomAttribute.Builder a2 = CrashlyticsReport.CustomAttribute.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("key")) {
                if (!nextName.equals("value")) {
                    jsonReader.skipValue();
                } else {
                    a2.c(jsonReader.nextString());
                }
            } else {
                a2.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session.Device s(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Device.Builder a2 = CrashlyticsReport.Session.Device.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals(C3209Hz.z)) {
                        c = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.i(jsonReader.nextBoolean());
                    break;
                case 1:
                    a2.e(jsonReader.nextString());
                    break;
                case 2:
                    a2.h(jsonReader.nextLong());
                    break;
                case 3:
                    a2.b(jsonReader.nextInt());
                    break;
                case 4:
                    a2.d(jsonReader.nextLong());
                    break;
                case 5:
                    a2.c(jsonReader.nextInt());
                    break;
                case 6:
                    a2.f(jsonReader.nextString());
                    break;
                case 7:
                    a2.j(jsonReader.nextInt());
                    break;
                case '\b':
                    a2.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session.Event t(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Builder a2 = CrashlyticsReport.Session.Event.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 0;
                        break;
                    }
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c = 1;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(FirebaseMessaging.r)) {
                        c = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 4;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.c(w(jsonReader));
                    break;
                case 1:
                    a2.e(C(jsonReader));
                    break;
                case 2:
                    a2.b(u(jsonReader));
                    break;
                case 3:
                    a2.d(A(jsonReader));
                    break;
                case 4:
                    a2.g(jsonReader.nextString());
                    break;
                case 5:
                    a2.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session.Event.Application u(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Builder a2 = CrashlyticsReport.Session.Event.Application.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1405314732:
                    if (nextName.equals("appProcessDetails")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1332194002:
                    if (nextName.equals(C3771Nr1.A.C)) {
                        c = 1;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c = 2;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c = 3;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c = 4;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1847730860:
                    if (nextName.equals("currentProcessDetails")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.b(p(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.d
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object a(JsonReader jsonReader2) {
                            CrashlyticsReport.Session.Event.Application.ProcessDetails I;
                            I = CrashlyticsReportJsonTransform.I(jsonReader2);
                            return I;
                        }
                    }));
                    break;
                case 1:
                    a2.c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 2:
                    a2.f(x(jsonReader));
                    break;
                case 3:
                    a2.g(p(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.c
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object a(JsonReader jsonReader2) {
                            CrashlyticsReport.CustomAttribute r;
                            r = CrashlyticsReportJsonTransform.r(jsonReader2);
                            return r;
                        }
                    }));
                    break;
                case 4:
                    a2.e(p(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.c
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object a(JsonReader jsonReader2) {
                            CrashlyticsReport.CustomAttribute r;
                            r = CrashlyticsReportJsonTransform.r(jsonReader2);
                            return r;
                        }
                    }));
                    break;
                case 5:
                    a2.h(jsonReader.nextInt());
                    break;
                case 6:
                    a2.d(I(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session.Event.Application.Execution.BinaryImage v(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder a2 = CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.c(jsonReader.nextString());
                    break;
                case 1:
                    a2.d(jsonReader.nextLong());
                    break;
                case 2:
                    a2.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a2.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session.Event.Device w(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Device.Builder a2 = CrashlyticsReport.Session.Event.Device.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    a2.c(jsonReader.nextInt());
                    break;
                case 2:
                    a2.e(jsonReader.nextInt());
                    break;
                case 3:
                    a2.d(jsonReader.nextLong());
                    break;
                case 4:
                    a2.g(jsonReader.nextLong());
                    break;
                case 5:
                    a2.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session.Event.Application.Execution x(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Builder a2 = CrashlyticsReport.Session.Event.Application.Execution.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.b(o(jsonReader));
                    break;
                case 1:
                    a2.f(p(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.f
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object a(JsonReader jsonReader2) {
                            CrashlyticsReport.Session.Event.Application.Execution.Thread E;
                            E = CrashlyticsReportJsonTransform.E(jsonReader2);
                            return E;
                        }
                    }));
                    break;
                case 2:
                    a2.e(D(jsonReader));
                    break;
                case 3:
                    a2.c(p(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.g
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object a(JsonReader jsonReader2) {
                            CrashlyticsReport.Session.Event.Application.Execution.BinaryImage v;
                            v = CrashlyticsReportJsonTransform.v(jsonReader2);
                            return v;
                        }
                    }));
                    break;
                case 4:
                    a2.d(y(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session.Event.Application.Execution.Exception y(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder a2 = CrashlyticsReport.Session.Event.Application.Execution.Exception.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals(SQ0.n)) {
                        c = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.c(p(jsonReader, new a()));
                    break;
                case 1:
                    a2.e(jsonReader.nextString());
                    break;
                case 2:
                    a2.f(jsonReader.nextString());
                    break;
                case 3:
                    a2.b(y(jsonReader));
                    break;
                case 4:
                    a2.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public static CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame z(@InterfaceC5670cr1 JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder a2 = CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals(InterfaceC8148mw2.c.R)) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.d(jsonReader.nextLong());
                    break;
                case 1:
                    a2.f(jsonReader.nextString());
                    break;
                case 2:
                    a2.e(jsonReader.nextLong());
                    break;
                case 3:
                    a2.b(jsonReader.nextString());
                    break;
                case 4:
                    a2.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @InterfaceC5670cr1
    public CrashlyticsReport N(@InterfaceC5670cr1 String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            CrashlyticsReport J = J(jsonReader);
            jsonReader.close();
            return J;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    @InterfaceC5670cr1
    public String O(@InterfaceC5670cr1 CrashlyticsReport crashlyticsReport) {
        return a.b(crashlyticsReport);
    }

    @InterfaceC5670cr1
    public CrashlyticsReport.ApplicationExitInfo j(@InterfaceC5670cr1 String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            CrashlyticsReport.ApplicationExitInfo o2 = o(jsonReader);
            jsonReader.close();
            return o2;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    @InterfaceC5670cr1
    public String k(@InterfaceC5670cr1 CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return a.b(applicationExitInfo);
    }

    @InterfaceC5670cr1
    public CrashlyticsReport.Session.Event l(@InterfaceC5670cr1 String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            CrashlyticsReport.Session.Event t = t(jsonReader);
            jsonReader.close();
            return t;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    @InterfaceC5670cr1
    public String m(@InterfaceC5670cr1 CrashlyticsReport.Session.Event event) {
        return a.b(event);
    }
}
