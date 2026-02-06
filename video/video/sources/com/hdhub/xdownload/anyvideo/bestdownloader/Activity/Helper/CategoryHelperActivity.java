package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper.CategoryHelperActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C2708Cz;
import o.C2723Dd;
import o.C2904Ez;
import o.C3231Ie2;
import o.C3774Ns;
import o.C4162Rs;
import o.C4343To;
import o.C5036aE2;
import o.C6269fJ2;
import o.DT1;
import o.TT1;

/* loaded from: classes3.dex */
public class CategoryHelperActivity extends ActivityC3020Gb {
    public ProgressBar C1;
    public RecyclerView D1;
    public ImageView E1;
    public TextView F1;
    public ArrayList<C2904Ez> G1 = new ArrayList<>();
    public C2708Cz H1;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CategoryHelperActivity.this.R().l();
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AbstractC2891Eu1 {
        public b(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            C5036aE2.a(CategoryHelperActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(HashMap<String, ArrayList<String>> hashMap);
    }

    public static /* synthetic */ void G1(final CategoryHelperActivity categoryHelperActivity, String str, final String str2, final HashMap hashMap) {
        categoryHelperActivity.getClass();
        categoryHelperActivity.M1(str, false, new c() { // from class: o.Az
            @Override // com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper.CategoryHelperActivity.c
            public final void a(HashMap hashMap2) {
                CategoryHelperActivity.H1(CategoryHelperActivity.this, str2, hashMap, hashMap2);
            }
        });
    }

    public static /* synthetic */ void H1(final CategoryHelperActivity categoryHelperActivity, String str, final HashMap hashMap, final HashMap hashMap2) {
        categoryHelperActivity.getClass();
        categoryHelperActivity.M1(str, false, new c() { // from class: o.Bz
            @Override // com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper.CategoryHelperActivity.c
            public final void a(HashMap hashMap3) {
                CategoryHelperActivity.I1(CategoryHelperActivity.this, hashMap, hashMap2, hashMap3);
            }
        });
    }

    public static /* synthetic */ void I1(CategoryHelperActivity categoryHelperActivity, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        categoryHelperActivity.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : hashMap.keySet()) {
            arrayList.add(new C2904Ez(str, (ArrayList) hashMap.getOrDefault(str, new ArrayList()), (ArrayList) hashMap2.getOrDefault(str, new ArrayList()), (ArrayList) hashMap3.getOrDefault(str, new ArrayList())));
        }
        C2723Dd.T1(arrayList);
        ArrayList<C2904Ez> w0 = C2723Dd.w0();
        categoryHelperActivity.G1 = w0;
        if (w0 != null && !w0.isEmpty()) {
            Collections.shuffle(categoryHelperActivity.G1);
            categoryHelperActivity.C1.setVisibility(8);
            categoryHelperActivity.D1.setVisibility(0);
            categoryHelperActivity.H1 = new C2708Cz(categoryHelperActivity, categoryHelperActivity.G1, categoryHelperActivity.getIntent().getIntExtra("vtype", 1));
            categoryHelperActivity.D1.setLayoutManager(new GridLayoutManager(categoryHelperActivity, 1));
            categoryHelperActivity.D1.setAdapter(categoryHelperActivity.H1);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2904Ez c2904Ez = (C2904Ez) it.next();
            Log.e("FINAL", "Name = " + c2904Ez.a() + "\nImages = " + c2904Ez.b() + "\nVideos = " + c2904Ez.d() + "\nNameList = " + c2904Ez.c());
        }
    }

    public static /* synthetic */ void J1(CategoryHelperActivity categoryHelperActivity, boolean z, c cVar, String str) {
        String str2;
        String O1 = categoryHelperActivity.O1(str);
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        try {
            List<String[]> H = new C4162Rs(new StringReader(O1)).m(new C3774Ns().o(',').m(false).a()).a().H();
            String[] strArr = H.get(0);
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String K1 = categoryHelperActivity.K1(strArr[i]);
                if (!K1.isEmpty()) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (int i2 = 1; i2 < H.size(); i2++) {
                        String N1 = categoryHelperActivity.N1(H.get(i2), i);
                        if (!N1.isEmpty()) {
                            arrayList.add(N1);
                        }
                    }
                    hashMap.put(K1, arrayList);
                    if (z) {
                        str2 = "IMG";
                    } else {
                        str2 = "VIDEO";
                    }
                    Log.e(str2, "Added: " + K1 + " | count = " + arrayList.size());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        cVar.a(hashMap);
    }

    public final String K1(String str) {
        if (str == null) {
            return "";
        }
        return str.replace(TT1.e, "").trim();
    }

    public final void L1() {
        String F = C2723Dd.F();
        final String k0 = C2723Dd.k0();
        final String K = C2723Dd.K();
        M1(F, true, new c() { // from class: o.xz
            @Override // com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper.CategoryHelperActivity.c
            public final void a(HashMap hashMap) {
                CategoryHelperActivity.G1(CategoryHelperActivity.this, k0, K, hashMap);
            }
        });
    }

    public final void M1(String str, final boolean z, final c cVar) {
        C6269fJ2.a(this).a(new C3231Ie2(0, str, new DT1.b() { // from class: o.yz
            @Override // o.DT1.b
            public final void b(Object obj) {
                CategoryHelperActivity.J1(CategoryHelperActivity.this, z, cVar, (String) obj);
            }
        }, new DT1.a() { // from class: o.zz
            @Override // o.DT1.a
            public final void a(C6524gJ2 c6524gJ2) {
                Log.e("CSV", "Error: " + c6524gJ2);
            }
        }));
    }

    public final String N1(String[] strArr, int i) {
        String str;
        if (strArr == null || i >= strArr.length || (str = strArr[i]) == null) {
            return "";
        }
        return K1(str);
    }

    public final String O1(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith(TT1.e)) {
            return str.substring(1);
        }
        return str;
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_category);
        C4343To.j(this, (LinearLayout) findViewById(R.id.llnative), (LinearLayout) findViewById(R.id.llline));
        this.C1 = (ProgressBar) findViewById(R.id.progress);
        this.D1 = (RecyclerView) findViewById(R.id.recy_Category);
        this.E1 = (ImageView) findViewById(R.id.btn_back);
        TextView textView = (TextView) findViewById(R.id.headertxt);
        this.F1 = textView;
        textView.setText(getIntent().getStringExtra("title"));
        this.E1.setOnClickListener(new a());
        this.C1.setVisibility(0);
        this.D1.setVisibility(8);
        L1();
        R().e(new b(true));
    }
}
