// Generated by data binding compiler. Do not edit!
package com.farid.yjahzapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.farid.yjahzapplication.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSignUpBinding extends ViewDataBinding {
  @NonNull
  public final ImageView backgroundImage;

  @NonNull
  public final EditText confirmPasswordEditText;

  @NonNull
  public final TextView confirmPasswordTv;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final EditText emailEditText;

  @NonNull
  public final TextView emailTv;

  @NonNull
  public final TextView haveAnAccount;

  @NonNull
  public final TextView loginTv;

  @NonNull
  public final ImageView logoImageview;

  @NonNull
  public final EditText nameEditText;

  @NonNull
  public final TextView nameTv;

  @NonNull
  public final EditText passwordEditText;

  @NonNull
  public final TextView passwordTv;

  @NonNull
  public final EditText phoneNumberEditText;

  @NonNull
  public final TextView phoneNumberTv;

  @NonNull
  public final Button signUpButton;

  @NonNull
  public final CardView signUpCardView;

  protected FragmentSignUpBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView backgroundImage, EditText confirmPasswordEditText, TextView confirmPasswordTv,
      ConstraintLayout constraintLayout, EditText emailEditText, TextView emailTv,
      TextView haveAnAccount, TextView loginTv, ImageView logoImageview, EditText nameEditText,
      TextView nameTv, EditText passwordEditText, TextView passwordTv, EditText phoneNumberEditText,
      TextView phoneNumberTv, Button signUpButton, CardView signUpCardView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backgroundImage = backgroundImage;
    this.confirmPasswordEditText = confirmPasswordEditText;
    this.confirmPasswordTv = confirmPasswordTv;
    this.constraintLayout = constraintLayout;
    this.emailEditText = emailEditText;
    this.emailTv = emailTv;
    this.haveAnAccount = haveAnAccount;
    this.loginTv = loginTv;
    this.logoImageview = logoImageview;
    this.nameEditText = nameEditText;
    this.nameTv = nameTv;
    this.passwordEditText = passwordEditText;
    this.passwordTv = passwordTv;
    this.phoneNumberEditText = phoneNumberEditText;
    this.phoneNumberTv = phoneNumberTv;
    this.signUpButton = signUpButton;
    this.signUpCardView = signUpCardView;
  }

  @NonNull
  public static FragmentSignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_sign_up, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSignUpBinding>inflateInternal(inflater, R.layout.fragment_sign_up, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_sign_up, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSignUpBinding>inflateInternal(inflater, R.layout.fragment_sign_up, null, false, component);
  }

  public static FragmentSignUpBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentSignUpBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSignUpBinding)bind(component, view, R.layout.fragment_sign_up);
  }
}
