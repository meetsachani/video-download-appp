package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o.AbstractC9004qS;
import o.C11163zI2;
import o.C2872Ep2;
import o.C3607Mb;
import o.C6516gH2;
import o.C9097qq2;
import o.CK1;
import o.J;
import o.OL1;
import o.View$OnClickListenerC7099ih2;
import o.WE;

/* loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.d implements WE {
    public static final o A2;
    public static final boolean x2 = false;
    public static final String y2 = "SearchView";
    public static final String z2 = "nm";
    public final View A1;
    public final View B1;
    public final View C1;
    public final ImageView D1;
    public final ImageView E1;
    public final ImageView F1;
    public final ImageView G1;
    public final View H1;
    public q I1;
    public Rect J1;
    public Rect K1;
    public int[] L1;
    public int[] M1;
    public final ImageView N1;
    public final Drawable O1;
    public final int P1;
    public final int Q1;
    public final Intent R1;
    public final Intent S1;
    public final CharSequence T1;
    public m U1;
    public l V1;
    public View.OnFocusChangeListener W1;
    public n X1;
    public View.OnClickListener Y1;
    public boolean Z1;
    public boolean a2;
    public AbstractC9004qS b2;
    public boolean c2;
    public CharSequence d2;
    public boolean e2;
    public boolean f2;
    public int g2;
    public boolean h2;
    public CharSequence i2;
    public CharSequence j2;
    public boolean k2;
    public int l2;
    public SearchableInfo m2;
    public Bundle n2;
    public final Runnable o2;
    public Runnable p2;
    public final WeakHashMap<String, Drawable.ConstantState> q2;
    public final View.OnClickListener r2;
    public View.OnKeyListener s2;
    public final TextView.OnEditorActionListener t2;
    public final AdapterView.OnItemClickListener u2;
    public final AdapterView.OnItemSelectedListener v2;
    public TextWatcher w2;
    public final SearchAutoComplete z1;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends C3607Mb {
        public int c1;
        public SearchView d1;
        public boolean e1;
        public final Runnable f1;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.e();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                if (i < 640 || i2 < 480) {
                    return 160;
                }
                return CK1.x;
            }
            return CK1.x;
        }

        public void c() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.A2.c(this);
        }

        public boolean d() {
            if (TextUtils.getTrimmedLength(getText()) == 0) {
                return true;
            }
            return false;
        }

        public void e() {
            if (this.e1) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.e1 = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            if (this.c1 > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // o.C3607Mb, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.e1) {
                removeCallbacks(this.f1);
                post(this.f1);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.d1.g0();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.d1.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.d1.hasFocus() && getVisibility() == 0) {
                this.e1 = true;
                if (SearchView.R(getContext())) {
                    c();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.e1 = false;
                removeCallbacks(this.f1);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.e1 = false;
                removeCallbacks(this.f1);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.e1 = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.d1 = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.c1 = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, OL1.b.S);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1 = new a();
            this.c1 = getThreshold();
        }
    }

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.f0(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m0();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC9004qS abstractC9004qS = SearchView.this.b2;
            if (abstractC9004qS instanceof View$OnClickListenerC7099ih2) {
                abstractC9004qS.a(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.W1;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.F();
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.D1) {
                searchView.c0();
            } else if (view == searchView.F1) {
                searchView.Y();
            } else if (view == searchView.E1) {
                searchView.d0();
            } else if (view == searchView.G1) {
                searchView.h0();
            } else if (view == searchView.z1) {
                searchView.L();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.m2 == null) {
                return false;
            }
            if (searchView.z1.isPopupShowing() && SearchView.this.z1.getListSelection() != -1) {
                return SearchView.this.e0(view, i, keyEvent);
            }
            if (SearchView.this.z1.d() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.W(0, null, searchView2.z1.getText().toString());
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.d0();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.Z(i, 0, null);
        }
    }

    /* loaded from: classes.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.a0(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    /* loaded from: classes.dex */
    public interface n {
        boolean a(int i);

        boolean b(int i);
    }

    /* loaded from: classes.dex */
    public static class o {
        public Method a;
        public Method b;
        public Method c;

        public o() {
            this.a = null;
            this.b = null;
            this.c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT < 29) {
                return;
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class p extends J {
        public static final Parcelable.Creator<p> CREATOR = new a();
        public boolean Z;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<p> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public p[] newArray(int i) {
                return new p[i];
            }
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.Z + "}";
        }

        @Override // o.J, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.Z));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Z = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* loaded from: classes.dex */
    public static class q extends TouchDelegate {
        public final View a;
        public final Rect b;
        public final Rect c;
        public final Rect d;
        public final int e;
        public boolean f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.d = new Rect();
            this.c = new Rect();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i = this.e;
            rect3.inset(-i, -i);
            this.c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action != 1 && action != 2) {
                    if (action == 3) {
                        z2 = this.f;
                        this.f = false;
                    }
                    z = true;
                    z3 = false;
                } else {
                    z2 = this.f;
                    if (z2 && !this.d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                }
                z3 = z2;
                z = true;
            } else {
                if (this.b.contains(x, y)) {
                    this.f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (z && !this.c.contains(x, y)) {
                motionEvent.setLocation(this.a.getWidth() / 2, this.a.getHeight() / 2);
            } else {
                Rect rect = this.c;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            }
            return this.a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        o oVar;
        if (Build.VERSION.SDK_INT < 29) {
            oVar = new o();
        } else {
            oVar = null;
        }
        A2 = oVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public static boolean R(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(OL1.e.c0);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(OL1.e.d0);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        this.z1.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.z1;
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    public void F() {
        int i2;
        int i3;
        if (this.H1.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.B1.getPaddingLeft();
            Rect rect = new Rect();
            boolean b2 = C11163zI2.b(this);
            if (this.Z1) {
                i2 = resources.getDimensionPixelSize(OL1.e.P) + resources.getDimensionPixelSize(OL1.e.Q);
            } else {
                i2 = 0;
            }
            this.z1.getDropDownBackground().getPadding(rect);
            if (b2) {
                i3 = -rect.left;
            } else {
                i3 = paddingLeft - (rect.left + i2);
            }
            this.z1.setDropDownHorizontalOffset(i3);
            this.z1.setDropDownWidth((((this.H1.getWidth() + rect.left) + rect.right) + i2) - paddingLeft);
        }
    }

    public final Intent G(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.j2);
        if (str3 != null) {
            intent.putExtra(SearchIntents.b, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.n2;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.m2.getSearchActivity());
        return intent;
    }

    public final Intent H(Cursor cursor, int i2, String str) {
        int i3;
        Uri parse;
        String D;
        try {
            String D2 = View$OnClickListenerC7099ih2.D(cursor, "suggest_intent_action");
            if (D2 == null) {
                D2 = this.m2.getSuggestIntentAction();
            }
            if (D2 == null) {
                D2 = "android.intent.action.SEARCH";
            }
            String str2 = D2;
            String D3 = View$OnClickListenerC7099ih2.D(cursor, "suggest_intent_data");
            if (D3 == null) {
                D3 = this.m2.getSuggestIntentData();
            }
            if (D3 != null && (D = View$OnClickListenerC7099ih2.D(cursor, "suggest_intent_data_id")) != null) {
                D3 = D3 + RemoteSettings.i + Uri.encode(D);
            }
            if (D3 == null) {
                parse = null;
            } else {
                parse = Uri.parse(D3);
            }
            return G(str2, parse, View$OnClickListenerC7099ih2.D(cursor, "suggest_intent_extra_data"), View$OnClickListenerC7099ih2.D(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                i3 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i3 = -1;
            }
            Log.w(y2, "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            return null;
        }
    }

    public final Intent I(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i2;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.n2;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i2 = searchableInfo.getVoiceMaxResults();
        } else {
            i2 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i2);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent J(Intent intent, SearchableInfo searchableInfo) {
        String flattenToShortString;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            flattenToShortString = null;
        } else {
            flattenToShortString = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", flattenToShortString);
        return intent2;
    }

    public final void K() {
        this.z1.dismissDropDown();
    }

    public void L() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.z1);
            return;
        }
        o oVar = A2;
        oVar.b(this.z1);
        oVar.a(this.z1);
    }

    public final void M(View view, Rect rect) {
        view.getLocationInWindow(this.L1);
        getLocationInWindow(this.M1);
        int[] iArr = this.L1;
        int i2 = iArr[1];
        int[] iArr2 = this.M1;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    public final CharSequence N(CharSequence charSequence) {
        if (this.Z1 && this.O1 != null) {
            int textSize = (int) (this.z1.getTextSize() * 1.25d);
            this.O1.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.O1), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    public final boolean O() {
        Intent intent;
        SearchableInfo searchableInfo = this.m2;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            if (this.m2.getVoiceSearchLaunchWebSearch()) {
                intent = this.R1;
            } else if (this.m2.getVoiceSearchLaunchRecognizer()) {
                intent = this.S1;
            } else {
                intent = null;
            }
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean P() {
        return this.Z1;
    }

    public boolean Q() {
        return this.a2;
    }

    public boolean S() {
        return this.e2;
    }

    public final boolean T() {
        if ((this.c2 || this.h2) && !Q()) {
            return true;
        }
        return false;
    }

    public boolean U() {
        return this.c2;
    }

    public final void V(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e2) {
            Log.e(y2, "Failed launch activity: " + intent, e2);
        }
    }

    public void W(int i2, String str, String str2) {
        getContext().startActivity(G("android.intent.action.SEARCH", null, null, str2, i2, str));
    }

    public final boolean X(int i2, int i3, String str) {
        Cursor c2 = this.b2.c();
        if (c2 != null && c2.moveToPosition(i2)) {
            V(H(c2, i3, str));
            return true;
        }
        return false;
    }

    public void Y() {
        if (TextUtils.isEmpty(this.z1.getText())) {
            if (this.Z1) {
                l lVar = this.V1;
                if (lVar == null || !lVar.a()) {
                    clearFocus();
                    r0(true);
                    return;
                }
                return;
            }
            return;
        }
        this.z1.setText("");
        this.z1.requestFocus();
        this.z1.setImeVisibility(true);
    }

    public boolean Z(int i2, int i3, String str) {
        n nVar = this.X1;
        if (nVar != null && nVar.b(i2)) {
            return false;
        }
        X(i2, 0, null);
        this.z1.setImeVisibility(false);
        K();
        return true;
    }

    public boolean a0(int i2) {
        n nVar = this.X1;
        if (nVar != null && nVar.a(i2)) {
            return false;
        }
        j0(i2);
        return true;
    }

    public void b0(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void c0() {
        r0(false);
        this.z1.requestFocus();
        this.z1.setImeVisibility(true);
        View.OnClickListener onClickListener = this.Y1;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f2 = true;
        super.clearFocus();
        this.z1.clearFocus();
        this.z1.setImeVisibility(false);
        this.f2 = false;
    }

    public void d0() {
        Editable text = this.z1.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            m mVar = this.U1;
            if (mVar == null || !mVar.b(text.toString())) {
                if (this.m2 != null) {
                    W(0, null, text.toString());
                }
                this.z1.setImeVisibility(false);
                K();
            }
        }
    }

    public boolean e0(View view, int i2, KeyEvent keyEvent) {
        int length;
        if (this.m2 != null && this.b2 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 != 66 && i2 != 84 && i2 != 61) {
                if (i2 != 21 && i2 != 22) {
                    if (i2 == 19) {
                        this.z1.getListSelection();
                        return false;
                    }
                } else {
                    if (i2 == 21) {
                        length = 0;
                    } else {
                        length = this.z1.length();
                    }
                    this.z1.setSelection(length);
                    this.z1.setListSelection(0);
                    this.z1.clearListSelection();
                    this.z1.c();
                    return true;
                }
            } else {
                return Z(this.z1.getListSelection(), 0, null);
            }
        }
        return false;
    }

    public void f0(CharSequence charSequence) {
        Editable text = this.z1.getText();
        this.j2 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        q0(!isEmpty);
        s0(isEmpty);
        l0();
        p0();
        if (this.U1 != null && !TextUtils.equals(charSequence, this.i2)) {
            this.U1.a(charSequence.toString());
        }
        this.i2 = charSequence.toString();
    }

    public void g0() {
        r0(Q());
        i0();
        if (this.z1.hasFocus()) {
            L();
        }
    }

    public int getImeOptions() {
        return this.z1.getImeOptions();
    }

    public int getInputType() {
        return this.z1.getInputType();
    }

    public int getMaxWidth() {
        return this.g2;
    }

    public CharSequence getQuery() {
        return this.z1.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.d2;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.m2;
        if (searchableInfo != null && searchableInfo.getHintId() != 0) {
            return getContext().getText(this.m2.getHintId());
        }
        return this.T1;
    }

    public int getSuggestionCommitIconResId() {
        return this.Q1;
    }

    public int getSuggestionRowLayout() {
        return this.P1;
    }

    public AbstractC9004qS getSuggestionsAdapter() {
        return this.b2;
    }

    public void h0() {
        SearchableInfo searchableInfo = this.m2;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(J(this.R1, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(I(this.S1, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w(y2, "Could not find voice search activity");
            }
        }
    }

    public final void i0() {
        post(this.o2);
    }

    public final void j0(int i2) {
        Editable text = this.z1.getText();
        Cursor c2 = this.b2.c();
        if (c2 == null) {
            return;
        }
        if (c2.moveToPosition(i2)) {
            CharSequence convertToString = this.b2.convertToString(c2);
            if (convertToString != null) {
                setQuery(convertToString);
                return;
            } else {
                setQuery(text);
                return;
            }
        }
        setQuery(text);
    }

    public void k0(CharSequence charSequence, boolean z) {
        this.z1.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.z1;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.j2 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            d0();
        }
    }

    public final void l0() {
        boolean z;
        int[] iArr;
        boolean isEmpty = TextUtils.isEmpty(this.z1.getText());
        int i2 = 0;
        if (isEmpty && (!this.Z1 || this.k2)) {
            z = false;
        } else {
            z = true;
        }
        ImageView imageView = this.F1;
        if (!z) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.F1.getDrawable();
        if (drawable != null) {
            if (!isEmpty) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public void m0() {
        int[] iArr;
        if (this.z1.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.B1.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.C1.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void n0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.z1;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(N(queryHint));
    }

    public final void o0() {
        this.z1.setThreshold(this.m2.getSuggestThreshold());
        this.z1.setImeOptions(this.m2.getImeOptions());
        int inputType = this.m2.getInputType();
        int i2 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.m2.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.z1.setInputType(inputType);
        AbstractC9004qS abstractC9004qS = this.b2;
        if (abstractC9004qS != null) {
            abstractC9004qS.a(null);
        }
        if (this.m2.getSuggestAuthority() != null) {
            View$OnClickListenerC7099ih2 view$OnClickListenerC7099ih2 = new View$OnClickListenerC7099ih2(getContext(), this, this.m2, this.q2);
            this.b2 = view$OnClickListenerC7099ih2;
            this.z1.setAdapter(view$OnClickListenerC7099ih2);
            View$OnClickListenerC7099ih2 view$OnClickListenerC7099ih22 = (View$OnClickListenerC7099ih2) this.b2;
            if (this.e2) {
                i2 = 2;
            }
            view$OnClickListenerC7099ih22.N(i2);
        }
    }

    @Override // o.WE
    public void onActionViewCollapsed() {
        k0("", false);
        clearFocus();
        r0(true);
        this.z1.setImeOptions(this.l2);
        this.k2 = false;
    }

    @Override // o.WE
    public void onActionViewExpanded() {
        if (this.k2) {
            return;
        }
        this.k2 = true;
        int imeOptions = this.z1.getImeOptions();
        this.l2 = imeOptions;
        this.z1.setImeOptions(imeOptions | 33554432);
        this.z1.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.o2);
        post(this.p2);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.d, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            M(this.z1, this.J1);
            Rect rect = this.K1;
            Rect rect2 = this.J1;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            q qVar = this.I1;
            if (qVar == null) {
                q qVar2 = new q(this.K1, this.J1, this.z1);
                this.I1 = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            qVar.a(this.K1, this.J1);
        }
    }

    @Override // androidx.appcompat.widget.d, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        if (Q()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i4 = this.g2) > 0) {
                    size = Math.min(i4, size);
                }
            } else {
                size = this.g2;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i5 = this.g2;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        r0(pVar.Z);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.Z = Q();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        i0();
    }

    public final void p0() {
        int i2;
        if (T() && (this.E1.getVisibility() == 0 || this.G1.getVisibility() == 0)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.C1.setVisibility(i2);
    }

    public final void q0(boolean z) {
        int i2;
        if (this.c2 && T() && hasFocus() && (z || !this.h2)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.E1.setVisibility(i2);
    }

    public final void r0(boolean z) {
        int i2;
        int i3;
        this.a2 = z;
        int i4 = 8;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.z1.getText());
        this.D1.setVisibility(i2);
        q0(!isEmpty);
        View view = this.A1;
        if (z) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        view.setVisibility(i3);
        if (this.N1.getDrawable() != null && !this.Z1) {
            i4 = 0;
        }
        this.N1.setVisibility(i4);
        l0();
        s0(isEmpty);
        p0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (this.f2 || !isFocusable()) {
            return false;
        }
        if (!Q()) {
            boolean requestFocus = this.z1.requestFocus(i2, rect);
            if (requestFocus) {
                r0(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i2, rect);
    }

    public final void s0(boolean z) {
        int i2 = 8;
        if (this.h2 && !Q() && z) {
            this.E1.setVisibility(8);
            i2 = 0;
        }
        this.G1.setVisibility(i2);
    }

    public void setAppSearchData(Bundle bundle) {
        this.n2 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            Y();
        } else {
            c0();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.Z1 == z) {
            return;
        }
        this.Z1 = z;
        r0(z);
        n0();
    }

    public void setImeOptions(int i2) {
        this.z1.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.z1.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.g2 = i2;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.V1 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.W1 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.U1 = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.Y1 = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.X1 = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.d2 = charSequence;
        n0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i2;
        this.e2 = z;
        AbstractC9004qS abstractC9004qS = this.b2;
        if (abstractC9004qS instanceof View$OnClickListenerC7099ih2) {
            View$OnClickListenerC7099ih2 view$OnClickListenerC7099ih2 = (View$OnClickListenerC7099ih2) abstractC9004qS;
            if (z) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            view$OnClickListenerC7099ih2.N(i2);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.m2 = searchableInfo;
        if (searchableInfo != null) {
            o0();
            n0();
        }
        boolean O = O();
        this.h2 = O;
        if (O) {
            this.z1.setPrivateImeOptions(z2);
        }
        r0(Q());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.c2 = z;
        r0(Q());
    }

    public void setSuggestionsAdapter(AbstractC9004qS abstractC9004qS) {
        this.b2 = abstractC9004qS;
        this.z1.setAdapter(abstractC9004qS);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.N2);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.J1 = new Rect();
        this.K1 = new Rect();
        this.L1 = new int[2];
        this.M1 = new int[2];
        this.o2 = new b();
        this.p2 = new c();
        this.q2 = new WeakHashMap<>();
        f fVar = new f();
        this.r2 = fVar;
        this.s2 = new g();
        h hVar = new h();
        this.t2 = hVar;
        i iVar = new i();
        this.u2 = iVar;
        j jVar = new j();
        this.v2 = jVar;
        this.w2 = new a();
        int[] iArr = OL1.m.b5;
        C2872Ep2 G = C2872Ep2.G(context, attributeSet, iArr, i2, 0);
        C6516gH2.G1(this, context, iArr, attributeSet, G.B(), i2, 0);
        LayoutInflater.from(context).inflate(G.u(OL1.m.v5, OL1.j.z), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(OL1.g.e0);
        this.z1 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.A1 = findViewById(OL1.g.a0);
        View findViewById = findViewById(OL1.g.d0);
        this.B1 = findViewById;
        View findViewById2 = findViewById(OL1.g.o0);
        this.C1 = findViewById2;
        ImageView imageView = (ImageView) findViewById(OL1.g.Y);
        this.D1 = imageView;
        ImageView imageView2 = (ImageView) findViewById(OL1.g.b0);
        this.E1 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(OL1.g.Z);
        this.F1 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(OL1.g.f0);
        this.G1 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(OL1.g.c0);
        this.N1 = imageView5;
        C6516gH2.Q1(findViewById, G.h(OL1.m.w5));
        C6516gH2.Q1(findViewById2, G.h(OL1.m.B5));
        int i3 = OL1.m.z5;
        imageView.setImageDrawable(G.h(i3));
        imageView2.setImageDrawable(G.h(OL1.m.r5));
        imageView3.setImageDrawable(G.h(OL1.m.o5));
        imageView4.setImageDrawable(G.h(OL1.m.E5));
        imageView5.setImageDrawable(G.h(i3));
        this.O1 = G.h(OL1.m.y5);
        C9097qq2.a(imageView, getResources().getString(OL1.k.v));
        this.P1 = G.u(OL1.m.C5, OL1.j.y);
        this.Q1 = G.u(OL1.m.p5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.w2);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.s2);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(G.a(OL1.m.u5, true));
        int g2 = G.g(OL1.m.e5, -1);
        if (g2 != -1) {
            setMaxWidth(g2);
        }
        this.T1 = G.x(OL1.m.q5);
        this.d2 = G.x(OL1.m.x5);
        int o2 = G.o(OL1.m.i5, -1);
        if (o2 != -1) {
            setImeOptions(o2);
        }
        int o3 = G.o(OL1.m.h5, -1);
        if (o3 != -1) {
            setInputType(o3);
        }
        setFocusable(G.a(OL1.m.d5, true));
        G.I();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.R1 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.S1 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.H1 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        r0(this.Z1);
        n0();
    }
}
