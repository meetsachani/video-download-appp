package o;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.nE0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8219nE0 {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r5 == null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<String[]> a(String str) {
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        Exception e;
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.connect();
                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    try {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                arrayList.add(readLine.split(","));
                            } else {
                                try {
                                    break;
                                } catch (Exception unused) {
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (Exception unused2) {
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception unused3) {
                            }
                        }
                    }
                }
                bufferedReader.close();
            } catch (Exception e3) {
                bufferedReader = null;
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader2 != null) {
                }
                if (httpURLConnection != null) {
                }
                throw th;
            }
        } catch (Exception e4) {
            bufferedReader = null;
            e = e4;
            httpURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
        httpURLConnection.disconnect();
        return arrayList;
    }
}
