package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class CachedSettingsIo {
    public static final String b = "com.crashlytics.settings.json";
    public final File a;

    public CachedSettingsIo(FileStore fileStore) {
        this.a = fileStore.f(b);
    }

    public final File a() {
        return this.a;
    }

    public JSONObject b() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        Logger.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File a = a();
                if (a.exists()) {
                    fileInputStream = new FileInputStream(a);
                    try {
                        jSONObject = new JSONObject(CommonUtils.D(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Logger.f().e("Failed to fetch cached settings", e);
                        CommonUtils.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    Logger.f().k("Settings file does not exist.");
                    jSONObject = null;
                }
                CommonUtils.f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e2) {
                e = e2;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.f(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.f(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j, JSONObject jSONObject) {
        Logger.f().k("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                try {
                    jSONObject.put("expires_at", j);
                    FileWriter fileWriter2 = new FileWriter(a());
                    try {
                        fileWriter2.write(jSONObject.toString());
                        fileWriter2.flush();
                        CommonUtils.f(fileWriter2, "Failed to close settings writer.");
                    } catch (Exception e) {
                        e = e;
                        fileWriter = fileWriter2;
                        Logger.f().e("Failed to cache settings", e);
                        CommonUtils.f(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        fileWriter = fileWriter2;
                        CommonUtils.f(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
