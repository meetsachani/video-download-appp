package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC10251va;
import o.InterfaceC10571ws1;
import o.InterfaceC5056aJ2;
import o.InterfaceC8710pF0;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC10251va
/* loaded from: classes3.dex */
public class ConfigStorageClient {
    @InterfaceC8710pF0("ConfigStorageClient.class")
    public static final Map<String, ConfigStorageClient> c = new HashMap();
    public static final String d = "UTF-8";
    public final Context a;
    public final String b;

    public ConfigStorageClient(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @InterfaceC5056aJ2
    public static synchronized void b() {
        synchronized (ConfigStorageClient.class) {
            c.clear();
        }
    }

    public static synchronized ConfigStorageClient d(Context context, String str) {
        ConfigStorageClient configStorageClient;
        synchronized (ConfigStorageClient.class) {
            try {
                Map<String, ConfigStorageClient> map = c;
                if (!map.containsKey(str)) {
                    map.put(str, new ConfigStorageClient(context, str));
                }
                configStorageClient = map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return configStorageClient;
    }

    public synchronized Void a() {
        this.a.deleteFile(this.b);
        return null;
    }

    public String c() {
        return this.b;
    }

    @InterfaceC10571ws1
    public synchronized ConfigContainer e() throws IOException {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = this.a.openFileInput(this.b);
            try {
                int available = fileInputStream.available();
                byte[] bArr = new byte[available];
                fileInputStream.read(bArr, 0, available);
                ConfigContainer b = ConfigContainer.b(new JSONObject(new String(bArr, "UTF-8")));
                fileInputStream.close();
                return b;
            } catch (FileNotFoundException | JSONException unused) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (FileNotFoundException | JSONException unused2) {
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    public synchronized Void f(ConfigContainer configContainer) throws IOException {
        FileOutputStream openFileOutput = this.a.openFileOutput(this.b, 0);
        openFileOutput.write(configContainer.toString().getBytes("UTF-8"));
        openFileOutput.close();
        return null;
    }
}
