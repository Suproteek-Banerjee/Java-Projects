#!/bin/bash

# Base directory with all the projects
BASE_DIR="/Users/suproteek/Developer"

# Add each project as a separate commit
echo "Adding BMI Calculator..."
cp -r "$BASE_DIR/BMI_Calculator" .
git add BMI_Calculator
git commit -m "Add BMI Calculator Project"

echo "Adding BMR Calculator..."
cp -r "$BASE_DIR/BMR_Calculator" .
git add BMR_Calculator
git commit -m "Add BMR Calculator Project"

echo "Adding Body Fat Percentage Calculator..."
cp -r "$BASE_DIR/Body_Fat_Percentage_Calculator" .
git add Body_Fat_Percentage_Calculator
git commit -m "Add Body Fat Percentage Calculator Project"

echo "Adding Calorie Calculator..."
cp -r "$BASE_DIR/Calorie_Calculator" .
git add Calorie_Calculator
git commit -m "Add Calorie Calculator Project"

echo "Adding Compound Interest Calculator..."
cp -r "$BASE_DIR/Compound_Interest_Calculator" .
git add Compound_Interest_Calculator
git commit -m "Add Compound Interest Calculator Project"

echo "Adding Debt Ratio Calculator..."
cp -r "$BASE_DIR/Debt_Ratio" .
git add Debt_Ratio
git commit -m "Add Debt Ratio Calculator Project"

echo "Adding Future Investment Value..."
cp -r "$BASE_DIR/Future_Investment_Value" .
git add Future_Investment_Value
git commit -m "Add Future Investment Value Project"

echo "Adding Grades Calculator..."
cp -r "$BASE_DIR/Grades_Calculator" .
git add Grades_Calculator
git commit -m "Add Grades Calculator Project"

echo "Adding Income and Savings Calculator..."
cp -r "$BASE_DIR/Income_and_Savings_Calculator" .
git add Income_and_Savings_Calculator
git commit -m "Add Income & Savings Calculator Project"

echo "Adding Macros Calculator..."
cp -r "$BASE_DIR/Macros_Calculator" .
git add Macros_Calculator
git commit -m "Add Macros Calculator Project"

echo "Adding Sales and Tip Calculator..."
cp -r "$BASE_DIR/Sales_and_Tip_Calculator" .
git add Sales_and_Tip_Calculator
git commit -m "Add Sales & Tip Calculator Project"

echo "Adding Time Converter..."
cp -r "$BASE_DIR/TIme_Converter" .
git add TIme_Converter
git commit -m "Add Time Converter Project"

echo "Adding Tank Size Calculator..."
cp -r "$BASE_DIR/Tank_Size_Calculator" .
git add Tank_Size_Calculator
git commit -m "Add Tank Size Calculator Project"

echo "Adding Target Heartrate Calculator..."
cp -r "$BASE_DIR/Target_Heartrate_Calculator" .
git add Target_Heartrate_Calculator
git commit -m "Add Target Heartrate Calculator Project"

echo "Adding Teenager Salary..."
cp -r "$BASE_DIR/Teenager_Salary" .
git add Teenager_Salary
git commit -m "Add Teenager Salary Project"

echo "Removing .DS_Store files..."
find . -name ".DS_Store" -delete
git add -A
git commit -m "Remove macOS .DS_Store File"

echo "Adding .gitignore..."
cp "$BASE_DIR/.gitignore" .
git add .gitignore
git commit -m "Add .gitignore File"

echo "Repository built with 17 commits!"
git log --oneline
