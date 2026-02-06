package com.google.firebase.installations.local;

import com.google.firebase.FirebaseApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import o.InterfaceC5670cr1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class PersistedInstallation {
    public static final String c = "PersistedInstallation";
    public static final String d = "Fid";
    public static final String e = "AuthToken";
    public static final String f = "RefreshToken";
    public static final String g = "TokenCreationEpochInSecs";
    public static final String h = "ExpiresInSecs";
    public static final String i = "Status";
    public static final String j = "FisError";
    public File a;
    @InterfaceC5670cr1
    public final FirebaseApp b;

    /* loaded from: classes3.dex */
    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(@InterfaceC5670cr1 FirebaseApp firebaseApp) {
        this.b = firebaseApp;
    }

    public void a() {
        b().delete();
    }

    public final File b() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        File filesDir = this.b.n().getFilesDir();
                        this.a = new File(filesDir, "PersistedInstallation." + this.b.t() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    @InterfaceC5670cr1
    public PersistedInstallationEntry c(@InterfaceC5670cr1 PersistedInstallationEntry persistedInstallationEntry) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(d, persistedInstallationEntry.d());
            jSONObject.put(i, persistedInstallationEntry.g().ordinal());
            jSONObject.put(e, persistedInstallationEntry.b());
            jSONObject.put(f, persistedInstallationEntry.f());
            jSONObject.put(g, persistedInstallationEntry.h());
            jSONObject.put(h, persistedInstallationEntry.c());
            jSONObject.put(j, persistedInstallationEntry.e());
            createTempFile = File.createTempFile(c, "tmp", this.b.n().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (!createTempFile.renameTo(b())) {
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        }
        return persistedInstallationEntry;
    }

    public final JSONObject d() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(b());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    @InterfaceC5670cr1
    public PersistedInstallationEntry e() {
        JSONObject d2 = d();
        String optString = d2.optString(d, null);
        int optInt = d2.optInt(i, RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String optString2 = d2.optString(e, null);
        String optString3 = d2.optString(f, null);
        long optLong = d2.optLong(g, 0L);
        long optLong2 = d2.optLong(h, 0L);
        return PersistedInstallationEntry.a().d(optString).g(RegistrationStatus.values()[optInt]).b(optString2).f(optString3).h(optLong).c(optLong2).e(d2.optString(j, null)).a();
    }
}
