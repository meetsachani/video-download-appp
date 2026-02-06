package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import java.util.Map;
import o.C6562gT0;
import o.C8926q81;
import o.C8947qD2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class SessionEvents {
    @NotNull
    public static final SessionEvents a = new SessionEvents();
    @NotNull
    public static final DataEncoder b;

    static {
        DataEncoder j = new JsonDataEncoderBuilder().k(AutoSessionEventEncoder.b).l(true).j();
        C6562gT0.o(j, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        b = j;
    }

    private SessionEvents() {
    }

    public static /* synthetic */ SessionEvent b(SessionEvents sessionEvents, FirebaseApp firebaseApp, SessionDetails sessionDetails, SessionsSettings sessionsSettings, ProcessDetails processDetails, List list, Map map, String str, int i, Object obj) {
        String str2;
        Map map2 = map;
        if ((i & 32) != 0) {
            map2 = C8926q81.z();
        }
        Map map3 = map2;
        if ((i & 64) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        return sessionEvents.a(firebaseApp, sessionDetails, sessionsSettings, processDetails, list, map3, str2);
    }

    @NotNull
    public final SessionEvent a(@NotNull FirebaseApp firebaseApp, @NotNull SessionDetails sessionDetails, @NotNull SessionsSettings sessionsSettings, @NotNull ProcessDetails processDetails, @NotNull List<ProcessDetails> list, @NotNull Map<SessionSubscriber.Name, ? extends SessionSubscriber> map, @NotNull String str) {
        C6562gT0.p(firebaseApp, "firebaseApp");
        C6562gT0.p(sessionDetails, "sessionDetails");
        C6562gT0.p(sessionsSettings, "sessionsSettings");
        C6562gT0.p(processDetails, "currentProcessDetails");
        C6562gT0.p(list, "appProcessDetails");
        C6562gT0.p(map, "subscribers");
        C6562gT0.p(str, "firebaseInstallationId");
        return new SessionEvent(EventType.SESSION_START, new SessionInfo(sessionDetails.h(), sessionDetails.g(), sessionDetails.i(), sessionDetails.j(), new DataCollectionStatus(e(map.get(SessionSubscriber.Name.PERFORMANCE)), e(map.get(SessionSubscriber.Name.CRASHLYTICS)), sessionsSettings.b()), str), c(firebaseApp));
    }

    @NotNull
    public final ApplicationInfo c(@NotNull FirebaseApp firebaseApp) {
        String valueOf;
        String str;
        long longVersionCode;
        C6562gT0.p(firebaseApp, "firebaseApp");
        Context n = firebaseApp.n();
        C6562gT0.o(n, "firebaseApp.applicationContext");
        String packageName = n.getPackageName();
        PackageInfo packageInfo = n.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = String.valueOf(longVersionCode);
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str2 = valueOf;
        String j = firebaseApp.s().j();
        C6562gT0.o(j, "firebaseApp.options.applicationId");
        String str3 = Build.MODEL;
        C6562gT0.o(str3, C8947qD2.g);
        String str4 = Build.VERSION.RELEASE;
        C6562gT0.o(str4, "RELEASE");
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        C6562gT0.o(packageName, "packageName");
        String str5 = packageInfo.versionName;
        if (str5 == null) {
            str = str2;
        } else {
            str = str5;
        }
        String str6 = Build.MANUFACTURER;
        C6562gT0.o(str6, "MANUFACTURER");
        ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.a;
        Context n2 = firebaseApp.n();
        C6562gT0.o(n2, "firebaseApp.applicationContext");
        ProcessDetails d = processDetailsProvider.d(n2);
        Context n3 = firebaseApp.n();
        C6562gT0.o(n3, "firebaseApp.applicationContext");
        return new ApplicationInfo(j, str3, BuildConfig.d, str4, logEnvironment, new AndroidApplicationInfo(packageName, str, str2, str6, d, processDetailsProvider.c(n3)));
    }

    @NotNull
    public final DataEncoder d() {
        return b;
    }

    public final DataCollectionState e(SessionSubscriber sessionSubscriber) {
        if (sessionSubscriber == null) {
            return DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
        }
        if (sessionSubscriber.a()) {
            return DataCollectionState.COLLECTION_ENABLED;
        }
        return DataCollectionState.COLLECTION_DISABLED;
    }
}
