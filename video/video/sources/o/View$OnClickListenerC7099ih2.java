package o;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import o.OL1;

/* renamed from: o.ih2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class View$OnClickListenerC7099ih2 extends AbstractC7049iT1 implements View.OnClickListener {
    public static final int A1 = 0;
    public static final int B1 = 1;
    public static final int C1 = 2;
    public static final int D1 = -1;
    public static final boolean x1 = false;
    public static final String y1 = "SuggestionsAdapter";
    public static final int z1 = 50;
    public final SearchView j1;
    public final SearchableInfo k1;
    public final Context l1;
    public final WeakHashMap<String, Drawable.ConstantState> m1;
    public final int n1;
    public boolean o1;
    public int p1;
    public ColorStateList q1;
    public int r1;
    public int s1;
    public int t1;
    public int u1;
    public int v1;
    public int w1;

    /* renamed from: o.ih2$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.a = (TextView) view.findViewById(16908308);
            this.b = (TextView) view.findViewById(16908309);
            this.c = (ImageView) view.findViewById(16908295);
            this.d = (ImageView) view.findViewById(16908296);
            this.e = (ImageView) view.findViewById(OL1.g.z);
        }
    }

    public View$OnClickListenerC7099ih2(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.o1 = false;
        this.p1 = 1;
        this.r1 = -1;
        this.s1 = -1;
        this.t1 = -1;
        this.u1 = -1;
        this.v1 = -1;
        this.w1 = -1;
        this.j1 = searchView;
        this.k1 = searchableInfo;
        this.n1 = searchView.getSuggestionCommitIconResId();
        this.l1 = context;
        this.m1 = weakHashMap;
    }

    public static String D(Cursor cursor, String str) {
        return M(cursor, cursor.getColumnIndex(str));
    }

    public static String M(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e(y1, "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    public final CharSequence A(CharSequence charSequence) {
        if (this.q1 == null) {
            TypedValue typedValue = new TypedValue();
            this.l1.getTheme().resolveAttribute(OL1.b.x3, typedValue, true);
            this.q1 = this.l1.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.q1, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public final Drawable B(ComponentName componentName) {
        PackageManager packageManager = this.l1.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                Log.w(y1, "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(y1, e.toString());
            return null;
        }
    }

    public final Drawable C(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.m1.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.m1.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.l1.getResources());
        }
        Drawable B = B(componentName);
        if (B != null) {
            constantState = B.getConstantState();
        }
        this.m1.put(flattenToShortString, constantState);
        return B;
    }

    public final Drawable E() {
        Drawable C = C(this.k1.getSearchActivity());
        if (C != null) {
            return C;
        }
        return this.l1.getPackageManager().getDefaultActivityIcon();
    }

    public final Drawable F(Uri uri) {
        try {
            if (C10977yY.t.equals(uri.getScheme())) {
                try {
                    return G(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.l1.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    openInputStream.close();
                    return createFromStream;
                } catch (IOException e) {
                    Log.e(y1, "Error closing icon stream for " + uri, e);
                    return createFromStream;
                }
            }
            throw new FileNotFoundException("Failed to open " + uri);
        } catch (FileNotFoundException e2) {
            Log.w(y1, "Icon not found: " + uri + C6566gU0.h + e2.getMessage());
            return null;
        }
        Log.w(y1, "Icon not found: " + uri + C6566gU0.h + e2.getMessage());
        return null;
    }

    public Drawable G(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.l1.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    public final Drawable H(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.l1.getPackageName() + RemoteSettings.i + parseInt;
            Drawable y = y(str2);
            if (y != null) {
                return y;
            }
            Drawable l = C10201vM.l(this.l1, parseInt);
            Q(str2, l);
            return l;
        } catch (Resources.NotFoundException unused) {
            Log.w(y1, "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable y2 = y(str);
            if (y2 != null) {
                return y2;
            }
            Drawable F = F(Uri.parse(str));
            Q(str, F);
            return F;
        }
    }

    public final Drawable I(Cursor cursor) {
        int i = this.u1;
        if (i == -1) {
            return null;
        }
        Drawable H = H(cursor.getString(i));
        if (H != null) {
            return H;
        }
        return E();
    }

    public final Drawable J(Cursor cursor) {
        int i = this.v1;
        if (i == -1) {
            return null;
        }
        return H(cursor.getString(i));
    }

    public int K() {
        return this.p1;
    }

    public Cursor L(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.l1.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void N(int i) {
        this.p1 = i;
    }

    public final void O(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void P(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public final void Q(String str, Drawable drawable) {
        if (drawable != null) {
            this.m1.put(str, drawable.getConstantState());
        }
    }

    public final void R(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // o.AbstractC9004qS, o.C9253rS.a
    public void a(Cursor cursor) {
        if (this.o1) {
            Log.w(y1, "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.r1 = cursor.getColumnIndex("suggest_text_1");
                this.s1 = cursor.getColumnIndex("suggest_text_2");
                this.t1 = cursor.getColumnIndex("suggest_text_2_url");
                this.u1 = cursor.getColumnIndex("suggest_icon_1");
                this.v1 = cursor.getColumnIndex("suggest_icon_2");
                this.w1 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e(y1, "error changing cursor and caching columns", e);
        }
    }

    @Override // o.AbstractC9004qS, o.C9253rS.a
    public Cursor b(CharSequence charSequence) {
        String charSequence2;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        if (this.j1.getVisibility() == 0 && this.j1.getWindowVisibility() == 0) {
            try {
                Cursor L = L(this.k1, charSequence2, 50);
                if (L != null) {
                    L.getCount();
                    return L;
                }
            } catch (RuntimeException e) {
                Log.w(y1, "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    @Override // o.AbstractC9004qS, o.C9253rS.a
    public CharSequence convertToString(Cursor cursor) {
        String D;
        String D2;
        if (cursor == null) {
            return null;
        }
        String D3 = D(cursor, "suggest_intent_query");
        if (D3 != null) {
            return D3;
        }
        if (this.k1.shouldRewriteQueryFromData() && (D2 = D(cursor, "suggest_intent_data")) != null) {
            return D2;
        }
        if (!this.k1.shouldRewriteQueryFromText() || (D = D(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return D;
    }

    @Override // o.AbstractC9004qS
    public void d(View view, Context context, Cursor cursor) {
        int i;
        CharSequence M;
        a aVar = (a) view.getTag();
        int i2 = this.w1;
        if (i2 != -1) {
            i = cursor.getInt(i2);
        } else {
            i = 0;
        }
        if (aVar.a != null) {
            P(aVar.a, M(cursor, this.r1));
        }
        if (aVar.b != null) {
            String M2 = M(cursor, this.t1);
            if (M2 != null) {
                M = A(M2);
            } else {
                M = M(cursor, this.s1);
            }
            if (TextUtils.isEmpty(M)) {
                TextView textView = aVar.a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.a.setMaxLines(1);
                }
            }
            P(aVar.b, M);
        }
        ImageView imageView = aVar.c;
        if (imageView != null) {
            O(imageView, I(cursor), 4);
        }
        ImageView imageView2 = aVar.d;
        if (imageView2 != null) {
            O(imageView2, J(cursor), 8);
        }
        int i3 = this.p1;
        if (i3 != 2 && (i3 != 1 || (i & 1) == 0)) {
            aVar.e.setVisibility(8);
            return;
        }
        aVar.e.setVisibility(0);
        aVar.e.setTag(aVar.a.getText());
        aVar.e.setOnClickListener(this);
    }

    @Override // o.AbstractC9004qS, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w(y1, "Search suggestions cursor threw exception.", e);
            View r = r(this.l1, c(), viewGroup);
            if (r != null) {
                ((a) r.getTag()).a.setText(e.toString());
            }
            return r;
        }
    }

    @Override // o.AbstractC9004qS, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w(y1, "Search suggestions cursor threw exception.", e);
            View s = s(this.l1, c(), viewGroup);
            if (s != null) {
                ((a) s.getTag()).a.setText(e.toString());
            }
            return s;
        }
    }

    @Override // o.AbstractC9004qS, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        R(c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        R(c());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.j1.b0((CharSequence) tag);
        }
    }

    @Override // o.AbstractC7049iT1, o.AbstractC9004qS
    public View s(Context context, Cursor cursor, ViewGroup viewGroup) {
        View s = super.s(context, cursor, viewGroup);
        s.setTag(new a(s));
        ((ImageView) s.findViewById(OL1.g.z)).setImageResource(this.n1);
        return s;
    }

    public final Drawable y(String str) {
        Drawable.ConstantState constantState = this.m1.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    public void z() {
        a(null);
        this.o1 = true;
    }
}
