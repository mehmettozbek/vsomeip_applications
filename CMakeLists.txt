# CMakeLists.txt for vsomeip application

# Specify the minimum CMake version required
cmake_minimum_required(VERSION 3.0)

# Project name
project(vsomeip_example)

# Source file
set(SRC main.cpp)

# Define the vsomeipClient target
add_executable(vsomeipClient ${SRC})
