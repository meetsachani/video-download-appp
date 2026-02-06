package com.google.firebase.abt;

import android.text.TextUtils;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.InterfaceC5056aJ2;

/* loaded from: classes3.dex */
public class AbtExperimentInfo {
    @InterfaceC5056aJ2
    public static final String g = "experimentId";
    @InterfaceC5056aJ2
    public static final String h = "variantId";
    @InterfaceC5056aJ2
    public static final String i = "triggerEvent";
    public final String a;
    public final String b;
    public final String c;
    public final Date d;
    public final long e;
    public final long f;
    @InterfaceC5056aJ2
    public static final String j = "experimentStartTime";
    @InterfaceC5056aJ2
    public static final String l = "timeToLiveMillis";
    @InterfaceC5056aJ2
    public static final String k = "triggerTimeoutMillis";
    public static final String[] m = {"experimentId", j, l, k, "variantId"};
    @InterfaceC5056aJ2
    public static final DateFormat n = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    public AbtExperimentInfo(String str, String str2, String str3, Date date, long j2, long j3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = date;
        this.e = j2;
        this.f = j3;
    }

    public static AbtExperimentInfo a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str = conditionalUserProperty.d;
        if (str == null) {
            str = "";
        }
        return new AbtExperimentInfo(conditionalUserProperty.b, String.valueOf(conditionalUserProperty.c), str, new Date(conditionalUserProperty.m), conditionalUserProperty.e, conditionalUserProperty.j);
    }

    public static AbtExperimentInfo b(Map<String, String> map) throws AbtException {
        String str;
        l(map);
        try {
            Date parse = n.parse(map.get(j));
            long parseLong = Long.parseLong(map.get(k));
            long parseLong2 = Long.parseLong(map.get(l));
            String str2 = map.get("experimentId");
            String str3 = map.get("variantId");
            if (map.containsKey(i)) {
                str = map.get(i);
            } else {
                str = "";
            }
            return new AbtExperimentInfo(str2, str3, str, parse, parseLong, parseLong2);
        } catch (NumberFormatException e) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
        } catch (ParseException e2) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e2);
        }
    }

    public static void k(AbtExperimentInfo abtExperimentInfo) throws AbtException {
        l(abtExperimentInfo.j());
    }

    public static void l(Map<String, String> map) throws AbtException {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        for (String str : m) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
    }

    public String c() {
        return this.a;
    }

    public long d() {
        return this.d.getTime();
    }

    public long e() {
        return this.f;
    }

    public String f() {
        return this.c;
    }

    public long g() {
        return this.e;
    }

    public String h() {
        return this.b;
    }

    public AnalyticsConnector.ConditionalUserProperty i(String str) {
        String str2;
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty.a = str;
        conditionalUserProperty.m = d();
        conditionalUserProperty.b = this.a;
        conditionalUserProperty.c = this.b;
        if (TextUtils.isEmpty(this.c)) {
            str2 = null;
        } else {
            str2 = this.c;
        }
        conditionalUserProperty.d = str2;
        conditionalUserProperty.e = this.e;
        conditionalUserProperty.j = this.f;
        return conditionalUserProperty;
    }

    @InterfaceC5056aJ2
    public Map<String, String> j() {
        HashMap hashMap = new HashMap();
        hashMap.put("experimentId", this.a);
        hashMap.put("variantId", this.b);
        hashMap.put(i, this.c);
        hashMap.put(j, n.format(this.d));
        hashMap.put(k, Long.toString(this.e));
        hashMap.put(l, Long.toString(this.f));
        return hashMap;
    }
}
