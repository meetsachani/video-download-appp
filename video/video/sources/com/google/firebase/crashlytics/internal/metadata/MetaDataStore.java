package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class MetaDataStore {
    public static final Charset b = Charset.forName("UTF-8");
    public static final String c = "userId";
    public final FileStore a;

    public MetaDataStore(FileStore fileStore) {
        this.a = fileStore;
    }

    public static Map<String, String> e(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, p(jSONObject, next));
        }
        return hashMap;
    }

    public static List<RolloutAssignment> f(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray(RolloutAssignmentList.c);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(RolloutAssignment.a(string));
            } catch (Exception e) {
                Logger f = Logger.f();
                f.n("Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    public static String h(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    public static String m(List<RolloutAssignment> list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(RolloutAssignment.b.b(list.get(i))));
            } catch (JSONException e) {
                Logger.f().n("Exception parsing rollout assignment!", e);
            }
        }
        hashMap.put(RolloutAssignmentList.c, jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void n(File file) {
        if (file.exists() && file.delete()) {
            Logger f = Logger.f();
            f.g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    public static String o(String str) throws JSONException {
        return new JSONObject(str) { // from class: com.google.firebase.crashlytics.internal.metadata.MetaDataStore.1
            public final /* synthetic */ String a;

            {
                this.a = str;
                put(MetaDataStore.c, str);
            }
        }.toString();
    }

    public static String p(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    @InterfaceC5670cr1
    public File a(String str) {
        return this.a.p(str, UserMetadata.j);
    }

    @InterfaceC5670cr1
    public File b(String str) {
        return this.a.p(str, "keys");
    }

    @InterfaceC5670cr1
    public File c(String str) {
        return this.a.p(str, UserMetadata.k);
    }

    @InterfaceC5670cr1
    public File d(String str) {
        return this.a.p(str, UserMetadata.h);
    }

    @InterfaceC11300zs1
    public final String g(String str) throws JSONException {
        return p(new JSONObject(str), c);
    }

    public Map<String, String> i(String str) {
        return j(str, false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    public Map<String, String> j(String str, boolean z) {
        File b2;
        FileInputStream fileInputStream;
        Exception e;
        if (z) {
            b2 = a(str);
        } else {
            b2 = b(str);
        }
        if (b2.exists()) {
            ?? length = b2.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(b2);
                    } catch (Exception e2) {
                        fileInputStream = null;
                        e = e2;
                    } catch (Throwable th) {
                        th = th;
                        CommonUtils.f(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                    try {
                        Map<String, String> e3 = e(CommonUtils.D(fileInputStream));
                        CommonUtils.f(fileInputStream, "Failed to close user metadata file.");
                        return e3;
                    } catch (Exception e4) {
                        e = e4;
                        Logger.f().n("Error deserializing user metadata.", e);
                        n(b2);
                        CommonUtils.f(fileInputStream, "Failed to close user metadata file.");
                        return Collections.EMPTY_MAP;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable = length;
                    CommonUtils.f(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        n(b2);
        return Collections.EMPTY_MAP;
    }

    public List<RolloutAssignment> k(String str) {
        File c2 = c(str);
        if (c2.exists() && c2.length() != 0) {
            FileInputStream fileInputStream = null;
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(c2);
                    try {
                        List<RolloutAssignment> f = f(CommonUtils.D(fileInputStream2));
                        Logger f2 = Logger.f();
                        f2.b("Loaded rollouts state:\n" + f + "\nfor session " + str);
                        CommonUtils.f(fileInputStream2, "Failed to close rollouts state file.");
                        return f;
                    } catch (Exception e) {
                        e = e;
                        fileInputStream = fileInputStream2;
                        Logger.f().n("Error deserializing rollouts state.", e);
                        n(c2);
                        CommonUtils.f(fileInputStream, "Failed to close rollouts state file.");
                        return Collections.EMPTY_LIST;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        CommonUtils.f(fileInputStream, "Failed to close rollouts state file.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } else {
            n(c2);
            return Collections.EMPTY_LIST;
        }
    }

    @InterfaceC11300zs1
    public String l(String str) {
        FileInputStream fileInputStream;
        File d = d(str);
        FileInputStream fileInputStream2 = null;
        if (d.exists() && d.length() != 0) {
            try {
                fileInputStream = new FileInputStream(d);
            } catch (Exception e) {
                e = e;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                CommonUtils.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
            try {
                try {
                    String g = g(CommonUtils.D(fileInputStream));
                    Logger.f().b("Loaded userId " + g + " for session " + str);
                    CommonUtils.f(fileInputStream, "Failed to close user metadata file.");
                    return g;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.f(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                Logger.f().n("Error deserializing user metadata.", e);
                n(d);
                CommonUtils.f(fileInputStream, "Failed to close user metadata file.");
                return null;
            }
        }
        Logger.f().b("No userId set for session " + str);
        n(d);
        return null;
    }

    public void q(String str, Map<String, String> map) {
        r(str, map, false);
    }

    public void r(String str, Map<String, String> map, boolean z) {
        File b2;
        if (z) {
            b2 = a(str);
        } else {
            b2 = b(str);
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String h = h(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b2), b));
                try {
                    bufferedWriter2.write(h);
                    bufferedWriter2.flush();
                    CommonUtils.f(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Logger.f().n("Error serializing key/value metadata.", e);
                    n(b2);
                    CommonUtils.f(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.f(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void s(String str, List<RolloutAssignment> list) {
        File c2 = c(str);
        if (list.isEmpty()) {
            n(c2);
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String m = m(list);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c2), b));
                try {
                    bufferedWriter2.write(m);
                    bufferedWriter2.flush();
                    CommonUtils.f(bufferedWriter2, "Failed to close rollouts state file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Logger.f().n("Error serializing rollouts state.", e);
                    n(c2);
                    CommonUtils.f(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.f(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void t(String str, String str2) {
        File d = d(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String o2 = o(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d), b));
                try {
                    bufferedWriter2.write(o2);
                    bufferedWriter2.flush();
                    CommonUtils.f(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Logger.f().n("Error serializing user metadata.", e);
                    CommonUtils.f(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.f(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
